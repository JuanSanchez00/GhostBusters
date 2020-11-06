package EntidadGrafica;

import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public abstract class EntidadGrafica {
	protected JLabel label;
	protected ImageIcon actual;
	protected String[] imagenes;
	protected float altura,ancho;
	
	public EntidadGrafica(JLabel label, ImageIcon actual, String[] iamegenes, float altura, float ancho) {
		this.label = label;
		this.actual = actual;
		this.imagenes = imagenes;
		this.altura = altura;
		this.ancho = ancho;
	}
	
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
		return this.actual;
	}
}
