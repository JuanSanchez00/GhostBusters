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
	private ProyectilAlpha p;
	private JLabel label;
	private Enemigo enemigo;
	//static AutoRemove removedor;
	private MejorarArma m;
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
		setResizable(false);
		setBounds(100, 100, 700, 1000);
		mapa = new JPanelBackground();
		mapa.setBackground("src\\Graficas\\Mapas\\mapa1.png");
		mapa.setLayout(null);
		
		setContentPane(mapa);
		
		juego = new Juego(this);
		
		juego.inicializarNivel();
		
		/*PersonajePrincipal jugador = new PersonajePrincipal(juego);
		jugador.getEntidadGrafica().setPosicionX(50);
		jugador.getEntidadGrafica().setPosicionY(50);

		
		JLabel jugadorLabel = jugador.getEntidadGrafica().getJLabel();		
		jugadorLabel.setIcon(jugador.getEntidadGrafica().getImagenDefault());
		jugadorLabel.setSize(200, 500);
		jugadorLabel.setLocation(jugador.getEntidadGrafica().getPosicionX(),jugador.getEntidadGrafica().getPosicionY());
		this.addKeyListener(jugador.getInteligencia());
		mapa.add(jugadorLabel);*/
		
		
		/*p = new ProyectilAlpha(juego);
		p.getEntidadGrafica().setPosicionX(50);
		p.getEntidadGrafica().setPosicionY(50);
		
		JLabel pLabel = p.getEntidadGrafica().getJLabel();
		pLabel.setIcon(p.getEntidadGrafica().getImagenDefault());
		pLabel.setSize(500,500);
		pLabel.setLocation(p.getEntidadGrafica().getPosicionX(), p.getEntidadGrafica().getPosicionY());
		mapa.add(pLabel);
		
		ActionListener accion = new ActionListener() {
    		public void actionPerformed(ActionEvent ae) {
    			p.getInteligencia().accionar();
    		}
    	};
    	
    	Timer timer = new Timer(100, accion);
    	timer.start();*/
		
		/*label = new JLabel("HOLA BROOO");
		label.setBackground(Color.RED);
		label.setVisible(true);
		label.setOpaque(true);
		label.setLocation(50, 50);
		label.setSize(100,100);
		mapa.add(label);
		
		ActionListener accion = new ActionListener() {
    		public void actionPerformed(ActionEvent ae) {
    			System.out.println("LA PUTA MADREEEE");
    			mapa.remove(label);
    		}
    	};
    	
    	Timer timer = new Timer(5000, accion);
    	timer.start();
		
		/*m = new MejorarArma(juego);
		m.getEntidadGrafica().setPosicionX(0);
		m.getEntidadGrafica().setPosicionY(0);
		
		JLabel mLabel = m.getEntidadGrafica().getJLabel();		
		mLabel.setIcon(m.getEntidadGrafica().getImagenDefault());
		mLabel.setSize(500, 500);
		mLabel.setLocation(m.getEntidadGrafica().getPosicionX(),m.getEntidadGrafica().getPosicionY());
		mapa.add(mLabel);
		
		ActionListener accion = new ActionListener() {
    		public void actionPerformed(ActionEvent ae) {
    			m.getInteligencia().accionar();
    		}
    	};
    	
    	Timer timer = new Timer(10, accion);
    	timer.start();*/
		PersonajePrincipal personaje = new PersonajePrincipal(juego);
		juego.getListaEntidades().add(personaje);
		this.addKeyListener(personaje.getInteligencia());
	}
	
	public void cargarEntidades() {
        for(Entidad e:juego.getListaEntidades()) {
            JLabel label = e.getEntidadGrafica().getJLabel();
            label.setLocation(e.getEntidadGrafica().getPosicionX(),e.getEntidadGrafica().getPosicionY());
            mapa.add(label);
        }
        MovimientoEntidades me=new MovimientoEntidades(juego);
        me.start();
    }
	
	public void removerEntidad(Entidad entidad) {
		mapa.remove(entidad.getEntidadGrafica().getJLabel());
	}
	
	
}

