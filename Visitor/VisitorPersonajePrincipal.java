package Visitor;

import EntidadLogica.*;

public class VisitorPersonajePrincipal extends Visitor {
	
	public VisitorPersonajePrincipal(Entidad entidad) {
		super(entidad);
		// TODO Auto-generated constructor stub
	}
	
	public void visitarPortadorAlpha(PortadorAlpha pa) {
		
	}
	//PREGUNTAR QUE HACER SI UN PERSONAJE SE CRUZA CON UN FANTASMA
	public void visitarPortadorBeta(PortadorBeta pb) {
		
	}

	public void visitarPocion(Pocion p) {
		
		
	}

	public void visitarMejorarArma(MejorarArma ma) {
		
		
	}

	public void visitarDetenerTiempo(DetenerTiempo dt) {
		
	}

	public void visitarProyectilBeta(ProyectilBeta pb) {
		
	}
	
	public void visitarProyectilAlpha(ProyectilAlpha pa) {
		
	}
}
