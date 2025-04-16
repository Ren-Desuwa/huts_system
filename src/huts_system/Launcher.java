package huts_system;

import com.formdev.flatlaf.FlatDarkLaf;
import controller.DataController;
import view.MainWindow;
import java.awt.EventQueue;
import java.sql.SQLException;
import tests.Tests;

public class Launcher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FlatDarkLaf.setup();
        EventQueue.invokeLater(() -> {
            try {
                DataController db = new DataController("asd");
                MainWindow main = new MainWindow(db);
                main.setVisible(true);
                System.out.println("Started");
            } catch (SQLException e) {
                System.out.println("crashed SQL");
            } catch (Exception e) {
                System.out.println("crashed");
            } 
        });
        
        
//        Tests test = new Tests();
//        test.runAll();
//        if (test.getStatus()) {
//            System.out.println("Tests Passed");
//            test.printSuccesses();
//        } else {
//            System.out.println("Tests Failed");
//            test.printErrors();
//        }
    }
    
}
