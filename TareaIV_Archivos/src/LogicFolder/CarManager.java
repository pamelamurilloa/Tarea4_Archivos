package LogicFolder;

import java.awt.Color;
import static java.awt.Color.*;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public class CarManager {
    
    private ArchiveManager archiveManager = new ArchiveManager();
    private ArchiveManager brandFileManager = new ArchiveManager();
    private ArchiveManager colorFileManager = new ArchiveManager();
    
    String[] brandList = {"Toyota", "Hyundai", "Ford", "Mercedes-Bendz", "Volkswaven", "Lamborghini"};
    HashMap<String, Color> colorList = new HashMap<>();
    
    public void fillFiles() {
        colorList.put("Blanco", white);
        colorList.put("Negro", black);
        colorList.put("Rojo", red);
        colorList.put("Amarillo", yellow);
        colorList.put("Azul", blue);
        colorList.put("Verde", green);
        
        File brandsFile = brandFileManager.createFileBrands();
        
        String brandString = "";
        
        for (String brand : brandList) {
            brandString = brandString + "\n" + brand;
        }
        brandFileManager.writeInFile(brandsFile, brandString);
       
        File colorsFile = colorFileManager.createFileColors();
        
        String colorString = "";
        
        for ( String color : colorList.keySet() ) {
            colorString = colorString + "\n" + color + ", " + colorList.get(color);
        }
        colorFileManager.writeInFile(colorsFile, colorString);
        
    }
    
    public HashMap getColorList() {
        HashMap<String, Color> colorHashMap = new HashMap();
         
        
        File colorFile = colorFileManager.createFileColors();
        ArrayList colorList = colorFileManager.readInFile(colorFile);
        
        for (int line = 0; colorList.size() > line; line++) {
            if (!colorList.get(line).toString().equals("")) {
                String[] colorData = colorList.get(line).toString().split(", ");
                
                colorHashMap.put(colorData[0], Color.getColor( colorData[1]) );
            }
        }
        
        return colorHashMap;
    }
    
    public String[] getBrandList() {
        String[] brandList = new String[6];
        
        File brandFile = brandFileManager.createFileBrands();
        ArrayList brandStringList = brandFileManager.readInFile(brandFile);
        
        for (int line = 0; brandStringList.size() > line; line++) {
            if (!brandStringList.get(line).toString().equals("")) {
                brandList[line] = brandStringList.get(line).toString();
            }
        }
        
        return brandList;
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
