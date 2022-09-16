package LogicFolder;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public class CarManager {
    
    private ArchiveManager archiveManager = new ArchiveManager();
    private ArchiveManager brandFileManager = new ArchiveManager();
    private ArchiveManager colorFileManager = new ArchiveManager();
    
    String[] brandList = {"Toyota", "Hyundai", "Ford", "Mercedes-Bendz", "Volkswaven", "Lamborghini"};
    String[] colorList = {"Blanco", "Negro", "Gris", "Café", "Amarillo", "Rojo", "Azul", "Rosado", "Verde"};
    
    public void fillFiles() {
        File brandsFile = brandFileManager.createFileBrands();
        
        String brandString = "";
        
        for (String brand : brandList) {
            brandString = brandString + "\n" + brand;
        }
        brandFileManager.writeInFile(brandsFile, brandString);
       
        File colorsFile = colorFileManager.createFileColors();
        
        String colorString = "";
        
        for (String color : colorList) {
            colorString = colorString + "\n" + color;
        }
        colorFileManager.writeInFile(colorsFile, colorString);
        
    }
    
    
    public boolean doesItExist(String carNumberPlater) {
        return getCarList().containsKey(carNumberPlater);
    }
    
    
    public String[] getCarData(String carNumberPlater) {
        String[] carData = new String[3];
        HashMap<String, HashMap> carHashMap = getCarList();
        HashMap<String, String> subBook = carHashMap.get(carNumberPlater);
        
        carData[0] = carNumberPlater;
        carData[1] = subBook.get("Brand");
        carData[2] = subBook.get("Color");
        carData[3] = subBook.get("Type");
        carData[4] = subBook.get("MaxSpeed");
        carData[5] = subBook.get("Price");
        
        return carData;
    }
    
    
    public HashMap<String, HashMap> getCarList() {
        HashMap<String, HashMap> carHashMap = new HashMap();
         
        
        File carFile = archiveManager.createFileCars();
        ArrayList carList = archiveManager.readInFile(carFile);
        
        for (int line = 0; carList.size() > line; line++) {
            if (!carList.get(line).toString().equals("")) {
                HashMap subCar = new HashMap();
                String[] carData = carList.get(line).toString().split(", ");
                
                subCar.put( "Brand", carData[1]);
                subCar.put( "Color", carData[2]);
                subCar.put( "Type", carData[3]);
                subCar.put( "MaxSpeed", carData[4]);
                subCar.put( "Price", carData[5]);
                
                carHashMap.put(carData[0], subCar);
            }
        }
        
        return carHashMap;
    }
    
    public boolean addCar(String[] carData) {
        
        boolean carAdded = false;
        if ( doesItExist(carData[0]) == false ) {
            String newLine = carData[0] + ", " + carData[1] + ", " + carData[2] + ", " + carData[3] + ", " + carData[4] + ", " + carData[5];
        
            File carFile = archiveManager.createFileCars();
            archiveManager.writeInFile(carFile, newLine);
            
            carAdded = true;
        }

        return carAdded;
        
    }
    
    
    public void deleteCar(String carNumberPlate) {
        File carFile = archiveManager.createFileCars();
        ArrayList<String> carList = archiveManager.readInFile(carFile);

        String newBookList = "";
        
        for (int line = 0; carList.size() > line; line++) {
            String[] currentLine = carList.get(line).toString().split(", ");
            
            if ( !currentLine[0].equals(carNumberPlate) && !currentLine[0].equals("") ) {
                    newBookList = newBookList + "\n" + carList.get(line);
                }
            }
        
        archiveManager.deleteAFile(carFile);
        archiveManager.createFileCars();
        archiveManager.writeInFile(carFile, newBookList);
    }
    
    
    public boolean changeCar(String carNumberPlate, String[] newCarData) {
        boolean carChanged = false;
        
        if ( doesItExist(carNumberPlate) ) {
            String[] carData = getCarData(carNumberPlate);

            for (int i = 0; newCarData.length > i; i++) {
                if (!newCarData[i].equals("") && newCarData[i] != carData[i]) {
                    carData[i] = newCarData[i];
                }
            }
            
            deleteCar(carNumberPlate);
            addCar(carData);
            
            carChanged = true;    
            
        }
        
        return carChanged;
    }
  
}
