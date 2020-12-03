package GUI;

import java.awt.EventQueue;
import javax.swing.JFrame;
import EntidadLogica.*;
import Hilos.MovimientoEntidades;
import Juego.Juego;

public class InterfazJuego extends JFrame {
	
	private JPanelBackground mapa;
	private Juego juego;
	private PersonajePrincipal personaje;
	
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

		
		personaje = new PersonajePrincipal(juego);
		juego.agregarEntidad(personaje);
		this.addKeyListener(personaje.getInteligencia());
	}
	
	public void cargarEntidades() {
        MovimientoEntidades me=new MovimientoEntidades(juego,personaje);
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

