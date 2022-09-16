/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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

/**
 *
 * @author pamelamurillo
 */
public class ArchiveManager {
    File usersFile;
    File carsFile;
    
    
    public void createFileUsers(){
        usersFile = new File("users.txt");
    }
    
    
    public void createFileCars(){
        usersFile = new File("users.txt");
    }
    
    
    public void writeInFile(String fileString, String textToWrite) { //This can get "users" or "books", and the text you wanna write in it
        File nameFile = carsFile;      //The automatic file creaded is the booksFile
        if ("users".equals(fileString)) {    //Unless it is specified the contrary
            nameFile = usersFile;
        }
        
        try {

            BufferedWriter bufferWriter = new BufferedWriter( new FileWriter(nameFile, true) );

            bufferWriter.write(textToWrite);        //writes the text
            bufferWriter.newLine();                 //Goes to the next line
            bufferWriter.close();                   //closes the file

        } catch (IOException ex) {
            Logger.getLogger(ArchiveManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
    public ArrayList readInFile(String fileString){ //This can get "users" or "books"
        File nameFile = carsFile;      //The automatic file creaded is the booksFile
        if ("users".equals(fileString)) {    //Unless it is specified the contrary
            nameFile = usersFile;
        }
        
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
    
    
    public void deleteAFile(String fileString) {
        File nameFile = carsFile;           //The automatic file creaded is the booksFile
        if ("users".equals(fileString)) {    //Unless it is specified the contrary
            nameFile = usersFile;
        }
        
        nameFile.delete();
    }
}
