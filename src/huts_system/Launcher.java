package huts_system;

import com.formdev.flatlaf.FlatDarkLaf;
import view.MainWindow;
import java.awt.EventQueue;

public class Launcher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FlatDarkLaf.setup();
        EventQueue.invokeLater(() -> {
            try {
                MainWindow main = new MainWindow();
                main.setVisible(true);
                System.out.println("Started");
            } catch (Exception e) {
                System.out.println("crashed");
            }
        });
    }
    
}
