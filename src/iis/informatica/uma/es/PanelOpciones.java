package iis.informatica.uma.es;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PanelOpciones extends JPanel {

	static final String botonReset = "Reiniciar";
	static final String botonNuevoVisor = "Nuevo visor";
	static final String botonEscogerArchivo = "Escoger Archivo";
	
	private JButton reset;
	private JButton nuevoVisor;
	private JButton escogerArchivo;
	
	private ControladorAplicacion contrlApp;
	
	public PanelOpciones()
	{
		
	  	reset = new JButton(botonReset);
		nuevoVisor = new JButton(botonNuevoVisor);
		escogerArchivo = new JButton(botonEscogerArchivo);
 	
	  	add(reset);
	  	add(nuevoVisor);
		add(escogerArchivo);
		this.setBorder(BorderFactory.createLineBorder(Color.YELLOW));

	}
	
	public void controlador(ActionListener contrl) {
	  	reset.addActionListener(contrl);
		nuevoVisor.addActionListener(contrl);
		escogerArchivo.addActionListener(contrl);		
	}

}
