package EntidadGrafica;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import EntidadLogica.Entidad;
import Juego.Juego;

public class EntidadGraficaPersonajePrincipal extends EntidadGrafica{
	
	public EntidadGraficaPersonajePrincipal(Entidad entidad){
		super(entidad);
		this.imagenes = new String[]{"src\\Graficas\\Personaje Principal\\PersonajePrincipalDefault.gif","src\\Graficas\\Personaje Principal//PersonajePrincipalMoverIzquierda.gif","src\\Graficas\\Personaje Principal\\PersonajePrincipalMoverDerecha.gif","src\\Graficas\\Personaje Principal\\PersonajePrincipalMuerte.gif"};
		imagenActual = imagenes[0];
		this.label.setSize(129,175);
		this.altura = 175;
		this.ancho = 129;
		agregarImagen(this.getImagenDefault());
		posicionX = (entidad.getJuego().getAncho()/2)-(this.ancho/2);
		posicionY = entidad.getJuego().getAltura()-this.altura-50;
	}
	
	public ImageIcon getImagenMovientoIzquierda() {
		return new ImageIcon(this.imagenes[1]);
	}
	
	public ImageIcon getImagenMovientoDerecha() {
		return new ImageIcon(this.imagenes[2]);
	}
	
	public ImageIcon getImagenMuerte() {
		return new ImageIcon(this.getClass().getResource(this.imagenes[3]));
	}
}
