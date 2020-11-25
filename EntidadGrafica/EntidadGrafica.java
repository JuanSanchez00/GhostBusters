package EntidadGrafica;

import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import EntidadLogica.Entidad;
import Juego.Juego;

public abstract class EntidadGrafica {
	protected JLabel label;
	protected String[] imagenes;
	protected int altura,ancho;
	protected int posicionX,posicionY;
	protected Entidad entidad;
	
	public EntidadGrafica(Entidad entidad) {
		this.label = new JLabel();
		this.entidad = entidad;
	}
	
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
		return new ImageIcon("C:\\Users\\aleja\\eclipse-workspace2\\Proeycto3TDP\\src\\Graficas\\Enemigos\\EnemigoBetaDefault.gif");
	}

	public void setPosicionX(int x) {
		this.posicionX = x;
	}
	
	public  void setPosicionY(int y) {
		this.posicionY = y;
	}
}
