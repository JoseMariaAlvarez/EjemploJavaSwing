package iis.informatica.uma.es;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelCombo extends JPanel {

	JLabel tfLabel;
	JTextField textF;
	JComboBox<String> comboOpciones;
	
	Vector <String> opcionesParaComboBox;
	
	public PanelCombo() {
		
		tfLabel = new JLabel("Escriba nueva opción para ComboBox (pulse ENTER al finalizar)");
		textF = new JTextField("",20);
		textF.setEditable(true);
		textF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("evento del text field");
					if (!presente(textF.getText())) {
					comboOpciones.addItem((String) textF.getText());
				}

			}});
		
		opcionesParaComboBox = new Vector<>();
		opcionesParaComboBox.add("");
		opcionesParaComboBox.add("Primera opción");
		opcionesParaComboBox.add("Segunda opción");
		opcionesParaComboBox.add("Tercera opción");
		opcionesParaComboBox.add("Cuarta opción");
		
		comboOpciones = new JComboBox<String>(opcionesParaComboBox);
		comboOpciones.setEditable(true);
		comboOpciones.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("comboBoxChanged")) {
					System.out.println("cambiada selección en combo box");					
				} else if (e.getActionCommand().equals("comboBoxEdited")) {
					System.out.println("modificada selección en combo box");					
 					if (!presente((String) comboOpciones.getSelectedItem())) {
						comboOpciones.addItem((String) comboOpciones.getSelectedItem());
					}
				}
			}});
		
		setLayout(new GridLayout(0,1));
		
		add (tfLabel);
		add (textF);
		add(comboOpciones);
		this.setBorder(BorderFactory.createLineBorder(Color.GREEN));


	}

	private boolean presente(String s) {
		boolean pres = false;
		int i = 0;
		while (!pres && (i < comboOpciones.getItemCount())){
			pres = comboOpciones.getItemAt(i).equals(s);
				i++;
		}
		return pres;
	}

	
}
