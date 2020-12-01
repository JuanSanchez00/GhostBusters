package GUI;

import java.awt.Color;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

import EntidadLogica.*;
import Hilos.MovimientoEntidades;
import Juego.Juego;
import Inteligencia.*;

public class InterfazJuego extends JFrame {
	
	private JPanelBackground mapa;
	private Juego juego;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazJuego frame = new InterfazJuego();
					frame.setVisible(true);
					frame.cargarEntidades();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public InterfazJuego() {
		juego = new Juego(this);
		setResizable(false);
		setBounds(100, 100, juego.getAncho(), juego.getAltura());
		mapa = new JPanelBackground();
		mapa.setLayout(null);
		setContentPane(mapa);
		
		juego.inicializarNivel();

		mapa.setBackground(juego.getNivelActual().getMapa());

		
		PersonajePrincipal personaje = new PersonajePrincipal(juego);
		juego.agregarEntidad(personaje);
		this.addKeyListener(personaje.getInteligencia());
	}
	
	public void cargarEntidades() {
        MovimientoEntidades me=new MovimientoEntidades(juego);
        me.start();
    }
	
	public void removerEntidad(Entidad entidad) {
		mapa.remove(entidad.getEntidadGrafica().getJLabel());
	}
	
	public void ponerMapa() {
        String ruta=juego.getNivelActual().getMapa();
        mapa.setBackground(ruta);
    }
}

