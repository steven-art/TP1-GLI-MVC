package partiejtable;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import Model.Item;
import Model.Modele;

public class TableDesItem extends AbstractTableModel{
	private Item item;
	// En-tête de Jtable
	private String[] columnNames={"idItem", "Name","Description","Fresh"};
	private ArrayList colonneName = new ArrayList();
	private ArrayList colonneLastName = new ArrayList();
	Object [][] values = {{9, "Basket-Ball", "Inscription et tenues", 500},
			{2,"Alimentation","Assez cher",250},

	};

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return columnNames.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return values.length;
	}

	public String getColumnNames(int col) {
		return columnNames[col];
	}

	public Class getColumnClass(int c) {
		return getValueAt(0,c).getClass();
	}
	public boolean isCellEditable(int row, int col) {
		return (col < 2);
	}
	public void setValueAt(Object value, int row, int col) {
		values[row][col] = value;
		fireTableCellUpdated(row,col);
	}
	@Override
	public Object getValueAt(int row, int col) {
		// TODO Auto-generated method stub
		return values[row][col];
	}

	public void addNewRow(int ligne) {
		int addline = getRowCount();
		if (ligne != -1)addline = ligne +1;
		colonneName.add(addline, "Name");
		colonneLastName.add(addline, "First Name");
		this.fireTableStructureChanged();
	}
	public void removeNewRow(int ligne) {
		if (getRowCount() == 0 || ligne < 0)
			return;colonneName.remove(ligne);
			colonneLastName.remove(ligne);
			this.fireTableStructureChanged();
	}

	public TableDesItem getModel() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getSelectedRow() {
		// TODO Auto-generated method stub
		return getRowCount();
	}
}





