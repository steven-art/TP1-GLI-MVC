package controller;


import java.util.List;

import javax.swing.JComponent;
import javax.swing.JFrame;

import Adapteur.AdapteurModel;
import Model.Item;
import Model.Modele;
import view.MyCamembertView;

public class Controller implements IController{


	private JComponent viewCam;
	private Modele model;
	private AdapteurModel adapter;
	private boolean selection;
	private int selectedPie;
	private Item item;

	public Controller(JComponent view, AdapteurModel adapter) {
		this.adapter = adapter;
		this.viewCam=view;
		selectedPie=0;
		selection=false;
	}
	public Controller(Modele mod) {
		// TODO Auto-generated constructor stub
		this.adapter= adapter;
	}
	@Override
	public void setSelected(boolean b) {
		// TODO Auto-generated method stub
		selection = b;
	}
	@Override
	public int getSelectedPie() {
		// TODO Auto-generated method stub
		return selectedPie;
	}
	@Override
	public void setSelectedPie(int i) {
		// TODO Auto-generated method stub
		selectedPie  = i;
	}

	public void selectPie(int i) {
		// TODO Auto-generated method stub
		selectedPie  = i;
	}
	@Override
	public boolean isSelected() {
		// TODO Auto-generated method stub
		return selection;
	}
	@Override
	public void deSelect() {
		// TODO Auto-generated method stub
		setSelected(false);
	}


	public void nextPie() {
		// TODO Auto-generated method stub
		selectedPie++;
	}

	public void previousPie() {
		// TODO Auto-generated method stub
		selectedPie--;
	}

	public JComponent getView() {
		return viewCam;

	}

	public void setView(JComponent view) {
		// TODO Auto-generated method stub
		this.viewCam = view;

	}

}
