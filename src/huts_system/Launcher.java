package huts_system;

import com.formdev.flatlaf.FlatDarkLaf;
import controller.DataController;
import view.MainWindow;
import java.awt.EventQueue;
import java.sql.SQLException;
import tests.Tests;
import view.Test;

public class Launcher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FlatDarkLaf.setup();
        EventQueue.invokeLater(() -> {
//            Test test = new Test();
//            test.setVisible(true);
            try {
                DataController database = new DataController("data/huts.db");
                MainWindow main = new MainWindow(database);
                main.setVisible(true);
                System.out.println("Started");
            } catch (SQLException e) {
                System.err.println("SQL Error: " + e.getMessage());
                e.printStackTrace();
            } catch (Exception e) {
                System.err.println("Unexpected Error: " + e.getMessage());
                e.printStackTrace();
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
