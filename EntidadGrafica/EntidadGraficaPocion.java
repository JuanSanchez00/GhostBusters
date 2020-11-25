package EntidadGrafica;

import javax.swing.JLabel;

import EntidadLogica.Entidad;
import Juego.Juego;

public class EntidadGraficaPocion extends EntidadGrafica {
	
	public EntidadGraficaPocion(Entidad entidad) {
		super(entidad);
		this.imagenes = new String[]{"/Grafica/Premios/Objeto Precioso/Curacion.gif"};
		this.altura = 1;
		this.ancho = 1;
	}
}
