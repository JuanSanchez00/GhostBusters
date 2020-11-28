package EntidadGrafica;

import javax.swing.JLabel;

import EntidadLogica.Entidad;

public class EntidadGraficaProyectilBeta extends EntidadGrafica{
	public EntidadGraficaProyectilBeta(Entidad entidad, int x, int y){
		super(entidad);
		this.entidad = entidad;
		this.imagenes = new String[] {"src\\Graficas\\Proyectiles\\ProyectilBeta.gif"};
		this.label.setSize(40,40);
		this.altura = 40;
		this.ancho = 40;
		agregarImagen(this.getImagenDefault());
		posicionX = x-ancho/2;
		posicionY = y+altura/2;
		this.label.setLocation(posicionX,posicionY);
	}
}
