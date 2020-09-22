package controller;

import javax.swing.JComponent;

import Model.IModele;

public interface IController {
	/**
	 * premet de savoir si la section et selectionne
	 * @return
	 */
	boolean isSelected();
	
	/**
	 * permet de changer la valeur de la selection
	 * @param b
	 */
	void setSelected(boolean b);
	
	/**
	 * retourn la valeur de la selectedPie
	 * @return
	 */
	int getSelectedPie();
	
	/**
	 * permet de changer la valeur de selectedPie
	 * @param index
	 */
	void setSelectedPie(int i);
	
	void deSelect(); 
	
	void nextPie();
	
	void previousPie();
	
	JComponent getView();
	
}
