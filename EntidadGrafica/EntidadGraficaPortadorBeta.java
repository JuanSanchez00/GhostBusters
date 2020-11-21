package EntidadGrafica;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class EntidadGraficaPortadorBeta extends EntidadGrafica{

	public EntidadGraficaPortadorBeta(){
		this.imagenes = new String[]{"/Grafica/Enemigo/EnemigoBetaDefault.gif","/Grafica/Enemigo/EnemigoBetaMuerte.gif"};
		this.label = new JLabel();
		this.altura = 1;
		this.ancho = 1;
	}
	
	public ImageIcon getImagenMuerte() {
		return new ImageIcon(this.getClass().getResource(this.imagenes[1]));
	}
}
