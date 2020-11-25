package EntidadGrafica;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import EntidadLogica.Entidad;
import Juego.Juego;

public class EntidadGraficaPortadorBeta extends EntidadGrafica{

	public EntidadGraficaPortadorBeta(Entidad entidad){
		super(entidad);
		this.imagenes = new String[]{"/Grafica/Enemigo/EnemigoBetaDefault.gif","/Grafica/Enemigo/EnemigoBetaMuerte.gif"};
		this.altura = 1;
		this.ancho = 1;
		Random rnd = new Random();
	    this.posicionX = rnd.nextInt(entidad.getJuego().getAncho()-ancho+1);
	}
	
	public ImageIcon getImagenMuerte() {
		return new ImageIcon(this.getClass().getResource(this.imagenes[1]));
	}
}
