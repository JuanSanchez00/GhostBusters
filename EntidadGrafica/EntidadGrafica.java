package EntidadGrafica;

import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public abstract class EntidadGrafica {
	protected JLabel label;
	protected String[] imagenes;
	protected int altura,ancho;
	protected int posicionX,posicionY;
	
	public int getPosicionX() {
		return this.posicionX;
	}
	
	public int getPosicionY() {
		return this.posicionY;
	}
	
	public int getAltura() {
		return this.altura;
	}
	
	public int getAncho() {
		return this.ancho;
	}
	
	public JLabel getJLabel() {
		return this.label;
	}
	
	public Rectangle getRectangulo() {
		return this.label.getBounds();
	}
	
	public ImageIcon getImagenDefault() {
		return new ImageIcon("C:\\Users\\Genaro\\eclipse-workspace\\ProyectoJuego\\src\\Graficas\\Premios\\Objeto Precioso\\SuperArma.gif");
	}

	public void setPosicionX(int x) {
		this.posicionX = x;
	}
	
	public  void setPosicionY(int y) {
		this.posicionY = y;
	}
}
