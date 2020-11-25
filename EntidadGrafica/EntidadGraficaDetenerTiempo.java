package EntidadGrafica;

import javax.swing.JLabel;

import EntidadLogica.Entidad;
import Juego.Juego;

public class EntidadGraficaDetenerTiempo extends EntidadGrafica {

	public EntidadGraficaDetenerTiempo(Entidad entidad){
		super(entidad);
		this.imagenes = new String[]{"/Grafica/Premios/Efecto Temporal/PararTiempo.gif"};
		this.altura = 1;
		this.ancho = 1;
	}

}
