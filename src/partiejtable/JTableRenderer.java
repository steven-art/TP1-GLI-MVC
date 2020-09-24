package partiejtable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JTableRenderer extends JFrame {
TableDesItem myTableDesItem ;
	
public JTableRenderer() {
	this.myTableDesItem =new TableDesItem();
}
	public void JTableExemple() {
		JButton myAddButton = new JButton("Ajouter");
		myAddButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				TableDesItem refModel = (TableDesItem)myTableDesItem.getModel();
				refModel.addNewRow(myTableDesItem.getSelectedRow());
			}
		});
		
		JButton myRemoveButton = new JButton("Supprimer");
		myRemoveButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				TableDesItem  refModel = (TableDesItem )myTableDesItem.getModel();
				refModel.removeNewRow(myTableDesItem.getSelectedRow());
			}
		});
	}

}
