package EntidadGrafica;
import javax.swing.JLabel;

import EntidadLogica.Entidad;

public class EntidadGraficaSuperArma extends EntidadGrafica{

	public EntidadGraficaSuperArma(Entidad entidad) {
		super(entidad);
		this.imagenes = new String[]{"/Grafica/Proyectiles/ProyectilSuperArma.png"};
		this.label.setSize(50,50);
		this.altura = 50;
		this.ancho = 50;
		agregarImagen(this.getImagenDefault());
	}
}
