package iis.informatica.uma.es;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class PrimerPanel extends JPanel {
	private JLabel etiqueta;
	private JButton boton;

	public PrimerPanel() {
		etiqueta = new JLabel("PRIMER panel");
		boton = new JButton("Ir a otro sitio.");
		add(etiqueta);
		add(boton);
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				MainFrame ancestro = (MainFrame) SwingUtilities.getWindowAncestor(PrimerPanel.this);
//				ancestro.changeActivePanel(MainFrame.SEGUNDOPANEL);
				JPanel cardParent = (JPanel) PrimerPanel.this.getParent();
				CardLayout cl = (CardLayout)(cardParent.getLayout());
		        cl.show(cardParent, UnPrincipal.SEGUNDOPANEL);
//		        this.pack();

			}
		});

	}
}
