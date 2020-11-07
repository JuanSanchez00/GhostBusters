package EntidadGrafica;
import javax.swing.JLabel;

public class EntidadGraficaSuperArma extends EntidadGrafica{

	public EntidadGraficaSuperArma() {
		this.imagenes = new String[]{"/Grafica/Proyectiles/ProyectilSuperArma.png"};
		this.label = new JLabel();
		this.altura = 1;
		this.ancho = 1;
	}
}
