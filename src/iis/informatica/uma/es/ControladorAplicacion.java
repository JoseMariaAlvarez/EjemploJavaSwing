package iis.informatica.uma.es;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class ControladorAplicacion implements ActionListener{

	String fileNameAndPath;
	PanelCombinado panelPr;

	public ControladorAplicacion(PanelCombinado pp) {
		fileNameAndPath = null;
		panelPr = pp;
	}
	public void actionPerformed(ActionEvent e) {

		String actComm = e.getActionCommand();
		if (actComm.compareTo(PanelOpciones.botonReset) == 0) {
			try {
				System.out.println("Botón Reiniciar");
			} catch (Exception ex) {
			}
		} else if (actComm.compareTo(PanelOpciones.botonNuevoVisor) == 0) {
			JOptionPane.showMessageDialog(null, "Opción aún no implementada.");
			System.out.println("Botón nuevo visor");
		} else if (actComm.compareTo(PanelOpciones.botonEscogerArchivo) == 0) {
			try {
				JFileChooser fch = new JFileChooser(".");
				fch.showOpenDialog(null);
				System.out.println(fch.getSelectedFile().getAbsolutePath());
			} catch (Exception ex) {
			}
		} else {
			System.out.println("MAAAAAAAL");
		}
	}

}
