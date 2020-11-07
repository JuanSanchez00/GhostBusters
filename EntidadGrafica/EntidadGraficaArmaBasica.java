package EntidadGrafica;

import javax.swing.JLabel;

public class EntidadGraficaArmaBasica extends EntidadGrafica{
	
	public EntidadGraficaArmaBasica(){
		this.imagenes = new String[]{"/Grafica/Proyectiles/ProyectilArmaBasica.png"};
		this.label = new JLabel();
		this.altura = 1;
		this.ancho = 1;
	}
}
