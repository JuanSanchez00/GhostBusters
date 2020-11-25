package EntidadGrafica;

import javax.swing.JLabel;

import EntidadLogica.Entidad;
import Juego.Juego;

public class EntidadGraficaArmaBasica extends EntidadGrafica{
	
	public EntidadGraficaArmaBasica(Entidad entidad){
		super(entidad);
		this.imagenes = new String[]{"/Grafica/Proyectiles/ProyectilArmaBasica.png"};
		this.altura = 1;
		this.ancho = 1;
	}
}
