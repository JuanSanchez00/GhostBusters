package EntidadGrafica;

import javax.swing.JLabel;

import EntidadLogica.Entidad;
import Juego.Juego;

public class EntidadGraficaProyectilAlpha extends EntidadGrafica{
	
	public EntidadGraficaProyectilAlpha(Entidad entidad){
		super(entidad);
		this.imagenes = new String[]{"/Grafica/Proyectiles/ProyectilAlpha.png"};
		this.altura = 500;
		this.ancho = 500;
	}
}
