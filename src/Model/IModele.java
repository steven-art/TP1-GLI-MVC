package Model;

import java.util.List;

import view.MyCamembertView;

public interface IModele {


	int size();
	
	double getValues(int i);
	
	void setItemValue(int index, int v);
	
	double total();
	

	String getTitle();
	
	String getUnit();
	

	
	String getTitle(int i);
	
	String getDescription(int i);
	
	Item getItem(int idItem);
	
	void deleteItem(int index);
	
	void addItem(Item item);
	

	void setUnit(String unit);

	

	
	
}
