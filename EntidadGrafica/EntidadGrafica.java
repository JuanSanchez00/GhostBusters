package EntidadGrafica;

import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public abstract class EntidadGrafica {
	protected JLabel label;
	protected String[] imagenes;
	protected float altura,ancho;
	
	public float getAltura() {
		return this.altura;
	}
	
	public float getAncho() {
		return this.ancho;
	}
	
	public JLabel getJLabel() {
		return this.label;
	}
	
	public Rectangle getRectangulo() {
		return this.label.getBounds();
	}
	
	public ImageIcon getImagenDefault() {
		return new ImageIcon(this.getClass().getResource(this.imagenes[0]));
	}
}
