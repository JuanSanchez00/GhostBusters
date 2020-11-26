package EntidadGrafica;

import javax.swing.JLabel;

import EntidadLogica.Entidad;
import Juego.Juego;

public class EntidadGraficaPocion extends EntidadGrafica {
	
	public EntidadGraficaPocion(Entidad entidad) {
		super(entidad);
		this.imagenes = new String[]{"/Grafica/Premios/Objeto Precioso/Curacion.gif"};
		this.label.setSize(50,50);
		this.altura = 50;
		this.ancho = 50;
		agregarImagen(this.getImagenDefault());
	}
}
