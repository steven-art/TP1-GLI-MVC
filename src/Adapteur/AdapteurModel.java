package Adapteur;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import Model.IModele;
import Model.Item;
import Model.Modele;
import view.MyCamembertView;

public class AdapteurModel extends Observable{

	private Modele model;

	public AdapteurModel(String t) {
		this.model = new Modele(t);
	}

	public void init() {
		//creation des items
		Item alimentation = new Item(2,"Alimentation","Assez cher",250);
		Item cinema = new Item(3,"cinema","pas cher",11);
		Item loyer = new Item(4,"loyer","Trés cher",600);

		//remplissage de la collection
		addItem(new Item(1,"Mobile","Assez cher",25));
		addItem(alimentation);
		addItem(cinema);
		addItem(loyer); 

	}


	public void addItem(Item item) {
		model.addItem(item);
		setChanged();
		notifyObservers();
	}


	public void deleteItem(int id) {
		model.deleteItem(id);
		setChanged();
		notifyObservers();
	}


	public int size() {
		return model.size();

	}

	public double getValues(int i) {
		return model.getValues(i);
	}

	public double total() {
		return model.total();

	}

	public String getTitle() {
		return model.getTitle();


	}
	public String getUnit() {
		return model.getUnit();

	}

	public String getTitle(int i) {
		return model.getTitle(i);

	}

	public String getDescription(int i) {
		return model.getDescription(i);

	}

}
