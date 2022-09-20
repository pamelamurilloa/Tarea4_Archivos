package LogicFolder;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArchiveManager {
    File usersFile;
    File carsFile;
    File colorsFile;
    File brandsFile;
    
    HashMap<String, String> administratorList = new HashMap();
    
    public File createFileUsers() {
        usersFile = new File("users.txt");
        return usersFile;
    }
    
    
    public File createFileCars() {
        carsFile = new File("cars.txt");
        return carsFile;
    }
    
    
    public File createFileColors() {
        colorsFile = new File("colors.txt");
        return colorsFile;
    }
    
    
    public File createFileBrands() {
        brandsFile = new File("brands.txt");
        return brandsFile;
    }
    
    
    public void writeInFile(File nameFile, String textToWrite){

        try {

            BufferedWriter bufferWriter = new BufferedWriter( new FileWriter(nameFile, true) );

            bufferWriter.write(textToWrite);        //writes the text
            bufferWriter.newLine();                 //Goes to the next line
            bufferWriter.close();                   //closes the file

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchiveManager.class.getName()).log(Level.SEVERE, null, ex);
            
        } catch (IOException ex) {
            Logger.getLogger(ArchiveManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
    public ArrayList readInFile(File nameFile) {
        
        ArrayList infoFile = new ArrayList();
        String line;
        
        try {
            
            BufferedReader bufferReader = new BufferedReader( new FileReader(nameFile) );

            while ( (line = bufferReader.readLine()) != null ) {
                infoFile.add(line);
            }
            
            bufferReader.close();
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchiveManager.class.getName()).log(Level.SEVERE, null, ex);
            
        } catch (IOException ex) {
            Logger.getLogger(ArchiveManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return infoFile;
    }
    
    public void addAdministrator(String name, String password) {
        createFileUsers();
        ArrayList userFile = readInFile(usersFile);
        for (int line = 0; userFile.size() > line; line++) {
            String[] newLine =  userFile.get(line).toString().split(", ");
            administratorList.put(newLine[0], newLine[1]);
        }
        
        if (administratorList.containsKey(name) == false) {
            writeInFile(usersFile, name + ", " + password);
        } 
        
    }
    
    public void deleteAFile(File nameFile) {
        nameFile.delete();
    }
}
