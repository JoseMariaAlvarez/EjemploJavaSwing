package iis.informatica.uma.es;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class PanelLista extends JPanel implements ListSelectionListener{

	JList<String> listOpciones;
	
	public PanelLista() {
		
		String opcionesLista[] = {"Opción 1", "Opción 2", "Opción 3", "Opción 4", "Opción 5"};
		
		listOpciones = new JList<String>(opcionesLista);
		add(listOpciones);
		
		listOpciones.addListSelectionListener(this);
		this.setBorder(BorderFactory.createLineBorder(Color.BLUE));

	}
	
	public void valueChanged(ListSelectionEvent e) {
	    if (e.getValueIsAdjusting() == false) {

	        if (listOpciones.getSelectedIndex() == -1) {
	        //No selection, disable fire button.
	            System.out.println("Ningún elemento seleccionado");

	        } else {
	        //Selection, enable the fire button.
	            for(String selecc: listOpciones.getSelectedValuesList()) {
	            	System.out.println(selecc);
	            }
	        }
	    }
	}
	
}
