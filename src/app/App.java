package app;

import java.awt.GridLayout;
import java.lang.ModuleLayer.Controller;

import javax.swing.JComponent;
import javax.swing.JFrame;

import Adapteur.AdapteurModel;
import Model.Modele;
import controller.controller;
import view.MyCamembertView;



public class App {
	
	
	

	// this main method should actually be placed in another class (it's here just to avoid having multiple files)
	public static void main(String[] a) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(30, 30, 400, 400);
		
		
		// Create an instance of the model
		Modele model= new Modele();
		
		
		// Create the controller and the view and link all together
		AdapteurModel adapter=new AdapteurModel();
		JComponent view = new MyCamembertView(adapter);
		controller controler= new controller(view, adapter);
		model.setTitle("Budget");
		model.init();
		model.addItem("Croquette");
		model.addItem("Croquette",15.5);

		// display layout
		GridLayout layout = new GridLayout(1, 2);

	//	window.getContentPane().add(controler.getView());
		

		window.setLayout(layout);
		window.pack();
		window.setVisible(true);
	}



}