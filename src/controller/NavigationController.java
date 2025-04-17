/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.MainWindow;
import javax.swing.JPanel;
import java.util.HashMap;
import java.util.Map;

public class NavigationController {
    private final MainWindow window;
    private final Map<String,JPanel> views = new HashMap<>(); 

    public NavigationController(MainWindow window) {
        this.window = window;
    }

    /** Register a view under a key. */
    public void registerView(String key, JPanel panel) {
        views.put(key, panel);
        window.getContentPanel().add(panel, key);
    }

    /** Show the view previously registered under this key. */
    public void show(String key) {
        window.getContentLayout().show(window.getContentPanel(), key);
    }
}
