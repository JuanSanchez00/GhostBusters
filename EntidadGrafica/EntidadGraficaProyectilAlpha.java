package EntidadGrafica;

import javax.swing.JLabel;

import EntidadLogica.Entidad;
import Juego.Juego;

public class EntidadGraficaProyectilAlpha extends EntidadGrafica{
	
	public EntidadGraficaProyectilAlpha(Entidad entidad){
		super(entidad);
		this.imagenes = new String[]{"/Grafica/Proyectiles/ProyectilAlpha.png"};
		this.label.setSize(40,40);
		this.altura = 40;
		this.ancho = 40;
		agregarImagen(this.getImagenDefault());
	}
}
