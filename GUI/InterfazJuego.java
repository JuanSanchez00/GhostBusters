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
import Juego.Juego;
import Inteligencia.*;

public class InterfazJuego extends JFrame {
	private JPanelBackground mapa;
	private Juego juego;
	private PortadorAlpha enemigo;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazJuego frame = new InterfazJuego();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public InterfazJuego() {
		setResizable(false);
		setBounds(100, 100, 700, 700);
		mapa = new JPanelBackground();
		mapa.setBackground("C:\\Users\\Genaro\\Desktop\\Gena\\mapa1.png");
		mapa.setLayout(null);
		
		setContentPane(mapa);
		
		juego = new Juego();
		
		/*PersonajePrincipal jugador = new PersonajePrincipal(juego);
		jugador.getEntidadGrafica().setPosicionX(50);
		jugador.getEntidadGrafica().setPosicionY(50);

		
		JLabel jugadorLabel = jugador.getEntidadGrafica().getJLabel();		
		jugadorLabel.setIcon(jugador.getEntidadGrafica().getImagenDefault());
		jugadorLabel.setSize(200, 500);
		jugadorLabel.setLocation(jugador.getEntidadGrafica().getPosicionX(),jugador.getEntidadGrafica().getPosicionY());
		this.addKeyListener(jugador.getInteligencia());
		mapa.add(jugadorLabel);*/
		
		/*enemigo = new PortadorAlpha(juego);
		enemigo.getEntidadGrafica().setPosicionX(50);
		enemigo.getEntidadGrafica().setPosicionY(50);
		
		JLabel enemigoLabel = enemigo.getEntidadGrafica().getJLabel();
		enemigoLabel.setIcon(enemigo.getEntidadGrafica().getImagenDefault());
		enemigoLabel.setSize(300, 500);
		enemigoLabel.setLocation(enemigo.getEntidadGrafica().getPosicionX(),enemigo.getEntidadGrafica().getPosicionY());
		mapa.add(enemigoLabel);
		
		ActionListener accion = new ActionListener() {
    		public void actionPerformed(ActionEvent ae) {
    			enemigo.getInteligencia().accionar();
    		}
    	};
    	
    	Timer timer = new Timer(1000, accion);
    	timer.start();*/
		
	}
	
	public void removerEntidad(Entidad entidad) {
		mapa.remove(entidad.getEntidadGrafica().getJLabel());
	}
	
}
