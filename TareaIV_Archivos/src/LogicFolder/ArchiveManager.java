package LogicFolder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArchiveManager {
    File usersFile;
    File carsFile;
    File colorsFile;
    File brandsFile;
    
    
    public File createFileUsers() {
        usersFile = new File("users.txt");
        return usersFile;
    }
    
    
    public File createFileCars() {
        carsFile = new File("users.txt");
        return carsFile;
    }
    
    
    public File createFileColors() {
        colorsFile = new File("colors.txt");
        return colorsFile;
    }
    
    
    public File createFileBrands() {
        brandsFile = new File("colors.txt");
        return brandsFile;
    }
    
    
    public void writeInFile(File nameFile, String textToWrite) { //This can get "users" or "books", and the text you wanna write in it
        
        try {

            BufferedWriter bufferWriter = new BufferedWriter( new FileWriter(nameFile, true) );

            bufferWriter.write(textToWrite);        //writes the text
            bufferWriter.newLine();                 //Goes to the next line
            bufferWriter.close();                   //closes the file

        } catch (IOException ex) {
            Logger.getLogger(ArchiveManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
    public ArrayList readInFile(File nameFile) { //This can get "users" or "books"
        
        ArrayList infoFile = new ArrayList();
        String line;
        
        try {
            
            BufferedReader bufferReader = new BufferedReader( new FileReader(nameFile) );

            while ( (line = bufferReader.readLine()) != null ) {
                infoFile.add(line);
            }
            
            bufferReader.close();
        
        } catch (IOException ex) {
            Logger.getLogger(ArchiveManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return infoFile;
    }
    
    
    public void deleteAFile(File nameFile) {
        nameFile.delete();
        
    }
}
