package partiejtable;


import java.util.ArrayList;
import java.util.List;

// Packages to import 
import javax.swing.JFrame; 
import javax.swing.JScrollPane; 
import javax.swing.JTable;

import Model.Item; 

public class TableDesItem { 
	// frame 
	private JFrame f; 
	// Table 
	private JTable j; 
	// Data to be displayed in the JTable 
	private Object[][] data = {{2,"Alimentation","Assez cher",250},
			{3,"shopping","trés peu",5.0}
	};


	// Column Names 
	String[] columnNames = { "id de l'Item", "Name", "Description","Valeur" }; 

	// Constructor 
	public TableDesItem() 
	{ 
		// Frame initiallization 
		f = new JFrame(); 

		// Frame Title 
		f.setTitle("Table d'ajout des élements du budget"); 


		// Initializing the JTable 
		j = new JTable(data, columnNames); 
		j.setBounds(30, 40, 200, 300); 

		// adding it to JScrollPane 
		JScrollPane sp = new JScrollPane(j); 
		f.add(sp); 
		// Frame Size 
		f.setSize(500, 200); 
		// Frame Visible = true 
		f.setVisible(true); 
	} 

	// Driver  method 
//	public static void main(String[] args) 
//	{  
//		new TableDesItem(); 
//	} 
	public int getColumnCount() {
		return columnNames.length;
	}
	//    public int getRowCount() {
	//    	return data.length;
	//    	}
	//    
	//    public void addRow(Item item) {
	//        data.add(item);
	//        fireTableRowsInserted(getRowCount() - 1, getRowCount() - 1);
	//    }
	//
	//    public void deleteRow() {
	//           for(int rowIndex = data.length - 1; rowIndex >= 0; rowIndex--) {
	//            if(data.get(rowIndex).isSelect()) {
	//          data.remove(rowIndex);
	//         }}}



} 
