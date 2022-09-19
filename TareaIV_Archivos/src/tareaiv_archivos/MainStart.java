package tareaiv_archivos;

import Interfaces.LoginFrame;
import LogicFolder.*;
import java.io.File;


public class MainStart {

    private static CarManager carManager = new CarManager();
    private static ArchiveManager archiveManager = new ArchiveManager();
    
    public static void main(String[] args) {
        carManager.fillFiles();
        archiveManager.addAdministrator("Admin", "123");
        LoginFrame newWindow = new LoginFrame();
        newWindow.setVisible(true);
    }
    
}
