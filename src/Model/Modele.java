package Model;
import java.awt.GraphicsConfiguration;
import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.event.EventListenerList;

import view.MyCamembertView;

public class Modele implements IModele{
		//variable 
	ArrayList<Item> listItem;
	
	private String Title;
	private  EventListenerList listeners;
	private String unit;
	
	public Modele(String title) {
		this.Title = title;
		listItem = new ArrayList<Item>();
		this.unit = "€";
			
	}
	
	public void init() {
		
	}
	
	//permet d'ajouté un item a la liste listItem
	public void addItem(Item item) {
		listItem.add(item);
	}
	
	public void deleteItem(int id) {
		
		listItem.remove(id);
	}
	
	public int size() {
		// TODO Auto-generated method stub
		return listItem.size();
	}

	public double getValues(int i) {
		// TODO Auto-generated method stub
		return listItem.get(i).getValue();
	}

	public double total() {
		// TODO Auto-generated method stub
		double res = 0;
		for(int i=0; i< listItem.size() ; i++) {
			res = res + listItem.get(i).getValue() ;
		}
		return res;
	}
	public void setTitle(String title) {
		this.Title = title;
	}
	
	public String getTitle() {
		// TODO Auto-generated method stub
		return Title;
	}

	public String getUnit() {
		// TODO Auto-generated method stub
		String dollard = "$";
		return dollard;
	}

	public String getTitle(int i) {
		// TODO Auto-generated method stub
		return listItem.get(i).getIntitule();
	}

	public String getDescription(int i) {
		// TODO Auto-generated method stub
		return listItem.get(i).getDescription();
	}

	@Override
	public void setItemValue(int index, int v) {
		// TODO Auto-generated method stub
		listItem.get(index).setValue(v);
		
	}

	@Override
	public void setUnit(String unit) {
		// TODO Auto-generated method stub
		this.unit = unit;
	}

	@Override
	public Item getItem(int idItem) {
		// TODO Auto-generated method stub
		return listItem.get(idItem);
	}

	public ArrayList<Item> getListItem() {
		return listItem;
	}

	public void setListItem(ArrayList<Item> listItem) {
		this.listItem = listItem;
	}


	
	}

