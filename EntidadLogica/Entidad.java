package EntidadLogica;

import EntidadGrafica.*;
import Visitor.*;
import Inteligencia.*;
import Juego.Juego;

public abstract class  Entidad {
	protected Visitor visitor;
	protected EntidadGrafica entidadGrafica;
	protected Inteligencia inteligencia;
	protected Inteligencia inteligenciaAux;
	protected Juego juego;
	protected int velocidad;
	
	public Entidad(Juego juego){
		this.juego = juego;
		inteligenciaAux = new inteligenciaTiempoDetenido(this);
	}
	
	public Visitor getVisitor() {
		return this.visitor;
	}
	
	public EntidadGrafica getEntidadGrafica() {
		return this.entidadGrafica;
	}
	
	public  Inteligencia getInteligencia() {
		return this.inteligencia;
	}
		
	public Juego getJuego() {
		return this.juego;
	}
	
	public int getVelocidad() {
		return this.velocidad;
	}
	
	public void desaparecer() {
		this.juego.getMapa().remove(this.getEntidadGrafica().getJLabel());
	}
	
	public void eliminar() {
		this.juego.getListaEntidades().remove(this);
	}
	
	public abstract void aceptarVisitor(Visitor v);
	
	public void cambiarInteligencias(){
		Inteligencia aux = inteligencia;
		inteligencia = inteligenciaAux;
		inteligenciaAux = aux;
	}
	
	public void setInteligencia(Inteligencia nuevaInteligencia) {
		this.inteligencia = nuevaInteligencia;
	}
}
