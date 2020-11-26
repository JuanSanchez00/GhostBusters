package EntidadGrafica;

import javax.swing.JLabel;

import EntidadLogica.Entidad;

public class EntidadGraficaProyectilBeta extends EntidadGrafica{
	public EntidadGraficaProyectilBeta(Entidad entidad){
		super(entidad);
		this.entidad = entidad;
		this.imagenes = new String[]{"/Grafica/Proyectiles/ProyectilAlpha.png"};
		this.label.setSize(40,40);
		this.altura = 40;
		this.ancho = 40;
		agregarImagen(this.getImagenDefault());
	}
}
