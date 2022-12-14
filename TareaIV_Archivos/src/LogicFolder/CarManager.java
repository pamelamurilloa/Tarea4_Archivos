package LogicFolder;

import Objects.LightCar;
import Objects.OffRoad;
import java.awt.Color;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public class CarManager {
    
    private ArchiveManager archiveManager = new ArchiveManager();
    private ArchiveManager brandFileManager = new ArchiveManager();
    private ArchiveManager colorFileManager = new ArchiveManager();
    
    ArrayList<String> brandList = new ArrayList<>();
    HashMap<String, Color> colorList = new HashMap<>();
    
    
    public void fillFiles() {
        colorList.put("Blanco", Color.white);
        colorList.put("Negro", Color.black);
        colorList.put("Rojo", Color.red.brighter());
        colorList.put("Amarillo", Color.orange);
        colorList.put("Azul", Color.blue.brighter());
        colorList.put("Verde", Color.green.darker());

        brandList.add("Toyota");
        brandList.add("Hyundai");
        brandList.add("Ford");
        brandList.add("Mercedes-Bendz");
        brandList.add("Volkswaven");
        brandList.add("Lamborghini");
        
        File brandsFile = brandFileManager.createFileBrands();
        brandFileManager.deleteAFile(brandsFile);
        brandsFile = brandFileManager.createFileBrands();
        
        
        String brandString = "";
        
        for (String brand : brandList) {
            brandString = brandString + "\n" + brand;
        }
        brandFileManager.writeInFile(brandsFile, brandString);
       
        File colorsFile = colorFileManager.createFileColors();
        colorFileManager.deleteAFile(colorsFile);
        colorsFile = colorFileManager.createFileColors();
        
        String colorString = "";
        
        for ( String color : colorList.keySet() ) {
            colorString = colorString + "\n" + color + ", " + colorList.get(color);
        }
        colorFileManager.writeInFile(colorsFile, colorString);
        
    }
    
    public HashMap getColorList() {
        HashMap<String, String> colorHashMap = new HashMap();
         
        
        File colorFile = colorFileManager.createFileColors();
        ArrayList colorList = colorFileManager.readInFile(colorFile);
        
        for (int line = 0; colorList.size() > line; line++) {
            if (!colorList.get(line).toString().equals("")) {
                String[] colorData = colorList.get(line).toString().split(", ");
                
                colorHashMap.put(colorData[0], colorData[1] );
            }
        }
        
        return colorHashMap;
    }
    
    public ArrayList getBrandList() {
        
        File brandFile = brandFileManager.createFileBrands();
        ArrayList brandList = brandFileManager.readInFile(brandFile);
        
        return brandList;
    }
    
    
    // Car managment
    
    public boolean doesItExist(String carNumberPlater) {
        archiveManager.createFileCars();
        return getCarList().containsKey(carNumberPlater);
    }
    
    
    public HashMap<String, String> getCarData(String carNumberPlater) {
        HashMap<String, HashMap> carHashMap = getCarList();
        HashMap<String, String> subCar = carHashMap.get( carNumberPlater );
        
        return subCar;
    }
    
    
    public HashMap<String, HashMap> getCarList() {
        
        HashMap<String, HashMap> carHashMap = new HashMap();
        
        File carFile = archiveManager.createFileCars();
        ArrayList carList = archiveManager.readInFile( carFile );
        
        for (int line = 0; carList.size() > line; line++) {
            if (!carList.get(line).toString().equals("")) {
                HashMap subCar = new HashMap();
                String[] carData = carList.get(line).toString().split(", ");
                
                subCar.put( "Price", carData[1]);
                subCar.put( "Brand", carData[2]);
                subCar.put( "Type", carData[3]);
                subCar.put( "Color", carData[4]);
                
                if ( carData[3].equals("LightCar") ) {
                    subCar.put( "Force", carData[5]);
                    subCar.put( "MaxSpeed", carData[6]);
                } else {
                    subCar.put( "Capacity", carData[5]);
                    subCar.put( "Available", carData[6]);
                }
                
                
                carHashMap.put(carData[0], subCar);
            }
        }
        
        return carHashMap;
    }
    
    public boolean addCar( String[] carData) {
        boolean carAdded = false;
        if ( doesItExist(carData[0]) == false ) {
            String newLine = carData[0] + ", " + carData[1] + ", " + carData[2] + ", " + carData[3] + ", " + carData[4] + ", " + carData[5] + ", " + carData[6];
        
            File carFile = archiveManager.createFileCars();
            archiveManager.writeInFile(carFile, newLine);
            
            carAdded = true;
        }

        return carAdded;
    }

    public void addOffRoadCar( OffRoad offRoadCar) {
        addCar( offRoadCar.getInfo() );
        
    }
    
    public void addLightCar( LightCar lightCar) {
        addCar( lightCar.getInfo() );
        
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
  
}
