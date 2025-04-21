/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.CardLayout;
import view.MainWindow;
import javax.swing.JPanel;

public class NavigationController {
    private final JPanel cardHolder;
    private final CardLayout layout;

    public NavigationController(JPanel cardHolder) {
        this.cardHolder = cardHolder;
        this.layout = (CardLayout) cardHolder.getLayout();
    }

    /** Register a view under a key. */
    public void register(String key, JPanel panel) {
        cardHolder.add(panel, key);
    }

    public void show(String key) {
        layout.show(cardHolder, key);
    }
}
