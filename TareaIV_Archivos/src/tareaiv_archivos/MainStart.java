package tareaiv_archivos;

import Interfaces.LoginFrame;
import LogicFolder.CarManager;


public class MainStart {

    private static CarManager carManager = new CarManager();
    
    
    public static void main(String[] args) {
        carManager.fillFiles();
        LoginFrame newWindow = new LoginFrame();
        newWindow.setVisible(true);
    }
    
}
