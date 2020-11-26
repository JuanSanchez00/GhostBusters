package EntidadGrafica;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import EntidadLogica.Entidad;
import Juego.Juego;

public class EntidadGraficaPersonajePrincipal extends EntidadGrafica{
	
	public EntidadGraficaPersonajePrincipal(Entidad entidad){
		super(entidad);
		this.imagenes = new String[]{"src\\Graficas\\Personaje Principal\\PersonajePrincipalDefault.gif","/Grafica/Personaje Principal/PersonajePrincipalMoverIzquierda.gif","/Grafica/Personaje Principal/PersonajePrincipalMoverDerecha.gif","/Grafica/Personaje Principal/PersonajePrincipalMuerte.gif"};
		this.label.setSize(129,175);
		this.altura = 175;
		this.ancho = 129;
		agregarImagen(this.getImagenDefault());
		posicionX = entidad.getJuego().getAncho()/2;
		posicionY = entidad.getJuego().getAltura()-this.altura;
	}
	
	public ImageIcon getImagenMovientoIzquierda() {
		return new ImageIcon(this.getClass().getResource(this.imagenes[1]));
	}
	
	public ImageIcon getImagenMovientoDerecha() {
		return new ImageIcon(this.getClass().getResource(this.imagenes[2]));
	}
	
	public ImageIcon getImagenMuerte() {
		return new ImageIcon(this.getClass().getResource(this.imagenes[3]));
	}
}
