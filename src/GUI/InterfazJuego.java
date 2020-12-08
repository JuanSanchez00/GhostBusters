package GUI;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import EntidadLogica.*;
import Hilos.ControladorJuego;
import Juego.Juego;

public class InterfazJuego extends JFrame {
	
	private JPanelBackground mapa;
	private Juego juego;
	private PersonajePrincipal personaje;
	private JLabel vida;
	private JLabel nivel;
	private JLabel oleada;
	private JPanel ventana;

	public static void main(String[] args) {
		mostrarSplash("/Graficas/Splash/SplashInicio.png",3000,10,10);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazJuego frame = new InterfazJuego();
					frame.cargarEntidades();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public InterfazJuego() {
		Font customFont = null;
		try {
			customFont = Font.createFont(Font.TRUETYPE_FONT, new File("src/Fuentes/halloweek.ttf")).deriveFont(25f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("src/Fuentes/halloweek.ttf")));
		} catch (IOException e) {
		       e.printStackTrace();
		} catch(FontFormatException e) {
		       e.printStackTrace();
		}
		
		juego = new Juego(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(10, 10, juego.getAncho(), juego.getAltura()+80);
		
		ventana = new JPanel();
		ventana.setBounds(100, 100, juego.getAncho(), juego.getAltura()+80);
		ventana.setLayout(new BorderLayout());
		
		mapa = new JPanelBackground();
		mapa.setLayout(null);
		mapa.setBounds(100, 100, juego.getAncho(), juego.getAltura());
		
		vida = new JLabel("",SwingConstants.CENTER);
		vida.setFont(customFont);
		vida.setForeground(Color.WHITE);
		
		nivel = new JLabel("",SwingConstants.CENTER);
		nivel.setFont(customFont);
		nivel.setForeground(Color.WHITE);
		
		oleada = new JLabel("",SwingConstants.CENTER);
		oleada.setFont(customFont);
		oleada.setForeground(Color.WHITE);
		
		Dimension d = new Dimension(juego.getAncho(),80);
		JPanelBackground panelSuperior = new JPanelBackground(); 
		panelSuperior.setLayout(new GridLayout(0,3,0,0));
		panelSuperior.setPreferredSize(d);
		panelSuperior.setBackground("/Graficas/Mapas/BarraSuperior.png");
		panelSuperior.add(vida);
		panelSuperior.add(nivel);
		panelSuperior.add(oleada);
		ventana.add(panelSuperior,BorderLayout.NORTH);
		ventana.add(mapa,BorderLayout.CENTER);

		juego.inicializarNivel();
		
		mapa.setBackground(juego.getNivelActual().getMapa());

		
		personaje = new PersonajePrincipal(juego);
		juego.agregarEntidad(personaje);
		this.addKeyListener(personaje.getInteligencia());
		setContentPane(ventana);
		setVisible(true);
	}
	
	public void cargarEntidades() {
		ControladorJuego me=new ControladorJuego(juego,personaje,vida,nivel,oleada);
        me.start();
    }
	
	public void removerEntidad(Entidad entidad) {
		mapa.remove(entidad.getEntidadGrafica().getJLabel());
	}
	
	public void ponerMapa() {
        String ruta=juego.getNivelActual().getMapa();
        mapa.setBackground(ruta);
    }
	
	public JPanelBackground getMapa(){
		return mapa;
	}
	
	public static void mostrarSplash(String ruta, int tiempo,int x, int y){
		SplashScreen splash = new SplashScreen(tiempo, ruta,x,y);
        splash.showSplash();
	}
	
	public void salir(){
		System.exit(0);
	}
	
	
}

