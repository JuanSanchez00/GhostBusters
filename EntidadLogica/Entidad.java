package EntidadLogica;

import EntidadGrafica.*;
import Visitor.*;
import Inteligencia.*;

public abstract class  Entidad {
	protected Visitor visitor;
	protected EntidadGrafica entidadGrafica;
	protected Inteligencia inteligencia;
	protected int posicionX,posicionY;
	
	public abstract Visitor getVisitor();
	public abstract EntidadGrafica getEntidadGrafica();
	public abstract Inteligencia getInteligencia();
	public abstract int getPosicionX();
	public abstract int getPosicionY();
	public abstract void setPosicionX(int x);
	public abstract void setPosicionY(int y);
	public abstract void aceptarVisitor(Entidad e);
}
