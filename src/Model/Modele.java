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
	
	private String Title ="Budget";
	private  EventListenerList listeners;
	private String unit;
	
	public Modele() {
		listItem = new ArrayList<Item>();
		this.unit = "€";
			
	}
	
	public void init() {
		
	 	//creation des items
	 	Item mobile = new Item(1,"Mobile","Assez cher",25);
		Item alimentation = new Item(2,"Alimentation","Assez cher",250);
		Item cinema = new Item(3,"cinema","pas cher",11);
		Item loyer = new Item(4,"loyer","Trés cher",600);
		
		//remplissage de la collection
		listItem.add(mobile);
		listItem.add(alimentation);
		listItem.add(cinema);
		listItem.add(loyer);
		// creation de l'ecouter
		listeners = new EventListenerList();
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

	public int getValues(int i) {
		// TODO Auto-generated method stub
		return listItem.get(i).getValue();
	}

	public int total() {
		// TODO Auto-generated method stub
		int res = 0;
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

