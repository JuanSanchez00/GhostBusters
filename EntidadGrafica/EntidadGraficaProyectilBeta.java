package EntidadGrafica;

import javax.swing.JLabel;

import EntidadLogica.Entidad;

public class EntidadGraficaProyectilBeta extends EntidadGrafica{
	
	public EntidadGraficaProyectilBeta(Entidad entidad, int x, int y){
		super(entidad);
		this.imagenes = new String[] {"src\\Graficas\\Proyectiles\\ProyectilBeta.gif"};
		this.altura = 40;
		this.ancho = 40;
		this.label.setSize(ancho,altura);
		agregarImagen(this.getImagenDefault());
		posicionX = x-ancho/2;
		posicionY = y+altura/2;
		this.label.setLocation(posicionX,posicionY);
	}
}
