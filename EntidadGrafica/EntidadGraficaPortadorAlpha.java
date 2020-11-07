package EntidadGrafica;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class EntidadGraficaPortadorAlpha extends EntidadGrafica{
	
	public EntidadGraficaPortadorAlpha() {
		this.imagenes = new String[]{"/Grafica/Enemigo/EnemigoAlphaDefault.gif","/Grafica/Enemigo/EnemigoAlphaMuerte.gif"};
		this.label = new JLabel();
		this.altura = 1;
		this.ancho = 1;
	}
	
	public ImageIcon getImagenMuerte() {
		return new ImageIcon(this.getClass().getResource(this.imagenes[1]));
	}
}
