package iis.informatica.uma.es;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class PanelCombinado extends JPanel{
	
	PanelOpciones panOp;
	PanelLista panl;
	PanelTextArea panTa;
	PanelCentral panCnt;
	PanelCombo panComb;
	
	public PanelCombinado() {
		this.setLayout(new BorderLayout());
		panOp = new PanelOpciones(); 
		panl = new PanelLista();
		panTa = new PanelTextArea();
		panCnt = new PanelCentral();
		panComb = new PanelCombo();
		add(panOp, BorderLayout.NORTH);
		add(panl, BorderLayout.WEST);
		add(panCnt, BorderLayout.CENTER);
		add(panTa, BorderLayout.SOUTH);
		add(panComb, BorderLayout.EAST);
	}
	
	
	public void controlador(ActionListener contrl) {
	  	panOp.controlador(contrl);		
	}

}
