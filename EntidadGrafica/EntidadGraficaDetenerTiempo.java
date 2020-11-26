package EntidadGrafica;

import javax.swing.JLabel;

import EntidadLogica.Entidad;
import Juego.Juego;

public class EntidadGraficaDetenerTiempo extends EntidadGrafica {

	public EntidadGraficaDetenerTiempo(Entidad entidad){
		super(entidad);
		this.imagenes = new String[]{"/Grafica/Premios/Efecto Temporal/PararTiempo.gif"};
		this.label.setSize(50,50);
		this.altura = 50;
		this.ancho = 50;
		agregarImagen(this.getImagenDefault());
	}

}
