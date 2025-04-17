package huts_system;

import com.formdev.flatlaf.FlatDarkLaf;
import controller.DataController;
import view.Login;
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
                DataController database = new DataController("data/huts.db");
                Login login = new Login(database);
                login.setVisible(true);
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
