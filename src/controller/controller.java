package controller;


import java.util.List;

import javax.swing.JComponent;
import javax.swing.JFrame;

import Adapteur.AdapteurModel;
import Model.Item;
import Model.Modele;
import view.MyCamembertView;

public class controller implements IController{
	

	private JComponent viewCam;
	private Modele model;
	private AdapteurModel adapter;
	private boolean selection;
	private int selectedPie;
	private Item item;
	 
	public controller(JComponent view, AdapteurModel adapter) {
	        this.adapter = adapter;
	        this.viewCam=view;
	        selectedPie=0;
	        selection=false;
	    }
	public controller(Modele mod) {
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
		int totalPie = adapter.getListItem().size();
	}

	public void previousPie() {
		// TODO Auto-generated method stub
		
	}
	
	public JComponent getView() {
		return viewCam;
		
	}

	public void setView(JComponent view) {
		// TODO Auto-generated method stub
		this.viewCam = view;
		
	}
// methode du model:
	 public String getName() {
         return adapter.getTitle();
     }



     public void setName(String new_name) {
         adapter.setTitle(new_name);
     }




     public void addItem(Item item) {
         adapter.addItem(item);
     }



     
     public void deleteItem(int index) {
         adapter.deleteItem(index);
     }



     public Item getItem(int index) {
         return adapter.getItem(index);
     }



     
     public int getValue(int index) {
         return adapter.getValues(index);
     }



     public void setItemValue1(int index, int new_value) {
         adapter.setItemValue(index, new_value);
     }
     
     public int size() {
         return adapter.size();
     }
     
     
     public String getUnit() {
         return adapter.getUnit();
     }



     public void setUnit(String unit) {
         adapter.setUnit(unit);
     }
	public void selectPie(int i) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public int getValues(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setItemValue(int index, int v) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int total() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTitle(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getDescription(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
