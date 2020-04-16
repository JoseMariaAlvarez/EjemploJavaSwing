package iis.informatica.uma.es;
import java.io.IOException;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class OtroPrincipal {

		
		public static void main(String [] args) throws IOException {
		  	
		  	SwingUtilities.invokeLater(new Runnable() {

				@Override
				public void run() {

				  	JFrame marcoPrincipal = new JFrame("Opciones");
				    marcoPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				    marcoPrincipal.setLayout(new GridLayout(1, 1));
					PanelCombinado pp = new PanelCombinado();

				    ControladorAplicacion contrlApl = new ControladorAplicacion(pp);
				    pp.controlador(contrlApl);

				    marcoPrincipal.getContentPane().add(pp);
				    marcoPrincipal.pack();

//				    marcoPrincipal.setSize(400, 100);
				    marcoPrincipal.setVisible(true);
					
				}});

		}
	}