package view;

import java.awt.EventQueue;

import controller.DataController;

public class Launcher {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DataController dbController = new DataController("data/huts.db");
					MainWindow frame = new MainWindow(dbController);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
