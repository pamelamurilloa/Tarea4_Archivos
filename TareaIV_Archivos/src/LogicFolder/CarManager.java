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
    
    
    
    public void deleteCar() {
        
    }
    
    
    
    public boolean doesItExist(String carNumberPlater) {
        return getCarList().containsKey(carNumberPlater);
    }
    
    
}
