package Model;

import java.util.List;

import view.MyCamembertView;

public interface IModele {


	int size();
	
	int getValues(int i);
	
	void setItemValue(int index, int v);
	
	int total();
	

	String getTitle();
	
	String getUnit();
	

	
	String getTitle(int i);
	
	String getDescription(int i);
	
	Item getItem(int idItem);
	
	void deleteItem(int index);
	
	void addItem(Item item);
	
//	List<Item> getItems();
	
//	void setName(String name);
	
//	String getName();

	void setUnit(String unit);

	

	
	
}
