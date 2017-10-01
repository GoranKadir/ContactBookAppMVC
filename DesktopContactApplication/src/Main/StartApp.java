package Main;


import Controller.MainController;
import View.MainWindowView;


public class StartApp {

	public static void main(String[] args) {
		
		MainWindowView main = new MainWindowView();
		MainController mainController = new MainController(main);
		main.setVisible(true);

	}

}
