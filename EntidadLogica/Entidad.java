package EntidadLogica;

import EntidadGrafica.*;
import Visitor.*;
import Inteligencia.*;

public abstract class  Entidad {
	protected Visitor visitor;
	protected EntidadGrafica entidadGrafica;
	protected Inteligencia inteligencia;
	protected int posicionX,posicionY;
	
	public Visitor getVisitor() {
		return this.visitor;
	}
	
	public EntidadGrafica getEntidadGrafica() {
		return this.entidadGrafica;
	}
	
	public  Inteligencia getInteligencia() {
		return this.inteligencia;
	}
	
	public int getPosicionX() {
		return this.posicionX;
	}
	
	public int getPosicionY() {
		return this.posicionY;
	}
	
	public void setPosicionX(int x) {
		this.posicionX = x;
	}
	
	public  void setPosicionY(int y) {
		this.posicionY = y;
	}
	
	public abstract void aceptarVisitor(Visitor v);
}
