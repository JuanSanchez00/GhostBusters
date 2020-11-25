package EntidadGrafica;

import javax.swing.JLabel;

import EntidadLogica.Entidad;

public class EntidadGraficaProyectilBeta extends EntidadGrafica{
	public EntidadGraficaProyectilBeta(Entidad entidad){
		super(entidad);
		this.entidad = entidad;
		this.imagenes = new String[]{"/Grafica/Proyectiles/ProyectilAlpha.png"};
		this.altura = 1;
		this.ancho = 1;
	}
}
