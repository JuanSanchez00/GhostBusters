package EntidadLogica;

import EntidadGrafica.*;
import Inteligencia.*;
import Visitor.*;

public class PersonajePrincipal extends EntidadPersonaje{

	public PersonajePrincipal() {
		super.visitor = new VisitorPersonajePrincipal();
		super.entidadGrafica = new EntidadGraficaPersonajePrincipal();
	}

	@Override
	public Visitor getVisitor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntidadGrafica getEntidadGrafica() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Inteligencia getInteligencia() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getPosicionX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPosicionY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setPosicionX(int x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPosicionY(int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float getCargaViral() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setCargaViral(float cv) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EntidadProyectil getProyectil() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void setProyectil(ProyectilSanitario ps) {
		super.proyectil = ps;
	}

	@Override
	public void disparar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean estaVivo() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void morir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aceptarVisitor(Entidad e) {
		// TODO Auto-generated method stub
		
	}
	
}
