package EntidadGrafica;
import javax.swing.JLabel;

import EntidadLogica.Entidad;

public class EntidadGraficaSuperArma extends EntidadGrafica{

	public EntidadGraficaSuperArma(Entidad entidad) {
		super(entidad);
		this.imagenes = new String[]{"/Grafica/Proyectiles/ProyectilSuperArma.png"};
		this.altura = 1;
		this.ancho = 1;
	}
}
