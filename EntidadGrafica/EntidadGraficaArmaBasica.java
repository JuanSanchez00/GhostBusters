package EntidadGrafica;

import javax.swing.JLabel;

import EntidadLogica.Entidad;
import Juego.Juego;

public class EntidadGraficaArmaBasica extends EntidadGrafica{
	
	public EntidadGraficaArmaBasica(Entidad entidad){
		super(entidad);
		this.imagenes = new String[]{"/Grafica/Proyectiles/ProyectilArmaBasica.png"};
		this.label.setSize(50,50);
		this.altura = 50;
		this.ancho = 50;
		agregarImagen(this.getImagenDefault());
	}
}
