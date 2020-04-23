package iis.informatica.uma.es;

import java.awt.Color;
import java.awt.Component;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PanelCentral extends JPanel {

	final static String RbParLabel = "Par";
	final static String RbImparLabel = "Impar";
	final static String rbsLabelText = "Escoja par o impar";
	
	JRadioButton rbPar;
	JRadioButton rbImpar;
	JLabel rbsLabel;
	JCheckBox opt1;
	JCheckBox opt2;
	
	public PanelCentral() {
		
		rbsLabel = new JLabel(rbsLabelText);
		rbsLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		rbPar = new JRadioButton(RbParLabel);
		rbPar.setAlignmentX(Component.CENTER_ALIGNMENT);
		rbImpar = new JRadioButton(RbImparLabel);
		rbImpar.setAlignmentX(Component.CENTER_ALIGNMENT);
		rbPar.setSelected(true);
		rbImpar.setSelected(false);
		ButtonGroup rbgParImpar = new ButtonGroup();
		rbgParImpar.add(rbPar);
		rbgParImpar.add(rbImpar);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(rbsLabel);
		add(rbPar);
		add(rbImpar);
		
		opt1 = new JCheckBox("Opción 1");
		opt2 = new JCheckBox("Opción 2");
		JPanel panelCheckBoxes = new JPanel();
		panelCheckBoxes.add(opt1);
		panelCheckBoxes.add(opt2);
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		add(panelCheckBoxes);
		
	}
}
