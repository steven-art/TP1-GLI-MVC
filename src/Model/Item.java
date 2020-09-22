package Model;

public class Item {
	// Attribut de la classe Item
	private int idItem;
	private String intitule;
	private String description;
	private int value;
	
	// constructeur de la class
	
	public Item(int idItem, String intitule, String description, int value) {
		this.idItem = idItem;
		this.intitule = intitule;
		this.description = description;
		this.value = value;
	}

	//getteur et setteur de la variable idItem
	public int getIdItem() {
		return idItem;
	}

	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}
	//getteur et setteur de la variable description
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	//getteur et setteur de la variable Intitule
	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	//getteur et setteur de la variable Value
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}
