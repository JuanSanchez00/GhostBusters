package EntidadGrafica;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import EntidadLogica.Entidad;
import Juego.Juego;

public class EntidadGraficaPortadorAlpha extends EntidadGrafica{
	
	public EntidadGraficaPortadorAlpha(Entidad entidad) {
		super(entidad);
		this.imagenes = new String[]{"/Grafica/Enemigo/EnemigoAlphaDefault.gif","/Grafica/Enemigo/EnemigoAlphaMuerte.gif"};
		this.altura = 500;
		this.ancho = 300;
		this.posicionY = -altura;
		Random rnd = new Random();
	    this.posicionX = rnd.nextInt(entidad.getJuego().getAncho()-ancho+1);
	}
	
	public ImageIcon getImagenMuerte() {
		return new ImageIcon(this.getClass().getResource(this.imagenes[1]));
	}
}
