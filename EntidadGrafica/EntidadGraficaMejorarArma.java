package EntidadGrafica;

import javax.swing.JLabel;

import EntidadLogica.Entidad;
import Juego.Juego;

public class EntidadGraficaMejorarArma extends EntidadGrafica {

	public EntidadGraficaMejorarArma(Entidad entidad) {
		super(entidad);
		this.imagenes = new String[]{"/Grafica/Premios/Objeto Precioso/SuperArma.gif"};
		this.altura = 500;
		this.ancho = 500;
	}
}
