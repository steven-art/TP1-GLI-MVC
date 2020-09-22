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

public class AdapteurModel extends Modele{
	
	private Observable observable;
	
	public AdapteurModel() {
		super();
	}
	@Override
	public void init() {
		super.init();
		this.observable.notify();;
	}
	
	public void addObserver(Observer observer)
	{
		this.observable.addObserver(observer);
	}
	
	@Override
	public void addItem(Item item) {
		super.addItem(item);
		this.observable.notify();
	}
	
	@Override
	public void deleteItem(int id) {
		super.deleteItem(id);
		this.observable.notify();
	}
	
	@Override
	public int size() {
		return super.size();
		
		
	}
	@Override
	public int getValues(int i) {
		return super.getValues(i);
	}
	@Override
	public void setItemValue(int index, int v) {
		super.setItemValue(index, v);
		this.observable.notify();
	}
	@Override
	public int total() {
		return super.total();
		
	}
	
	@Override
	public String getTitle() {
		return super.getTitle();
		
	}
	
	@Override
	public String getUnit() {
		return super.getUnit();
		
	}
	

	@Override
	public String getTitle(int i) {
		return super.getTitle(i);
		
	}
	
	@Override
	public String getDescription(int i) {
		return super.getDescription(i);
		
	}
	
	@Override
	public Item getItem(int idItem) {
		return super.getItem(idItem);
		
	}
//	@Override
//	public List<Item> getItems(){
//		return super.getItems();
//		
//	}
//	
//	@Override
//	public void setName(String name) {
//		super.setName(name);
//		this.observable.notify();
//	}
//	
//	@Override
//	public String getName() {
//		return super.getName();
//		
//	}
//	
	@Override
	public void setUnit(String unit) {
		super.setUnit(unit);
		this.observable.notify();
	}
	@Override
	public ArrayList<Item> getListItem() {
		return super.getListItem();
	}
}
