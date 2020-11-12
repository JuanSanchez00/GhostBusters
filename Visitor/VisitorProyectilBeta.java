package Visitor;

import EntidadLogica.*;

public class VisitorProyectilBeta extends Visitor {
	
	public VisitorProyectilBeta(Entidad entidad) {
		super(entidad);
		// TODO Auto-generated constructor stub
	}

	public void visitarPersonajePrincipal(PersonajePrincipal pp) {
		((ProyectilBeta) entidadActual).daniar(pp);
		entidadActual.desaparecer();
		entidadActual.eliminar();
	}

	public void visitarPortadorAlpha(PortadorAlpha pa) {
		// TODO Auto-generated method stub
		
	}


	public void visitarPortadorBeta(PortadorBeta pb) {
		// TODO Auto-generated method stub
		
	}


	public void visitarPocion(Pocion p) {
		// TODO Auto-generated method stub
		
	}


	public void visitarMejorarArma(MejorarArma ma) {
		// TODO Auto-generated method stub
		
	}


	public void visitarDetenerTiempo(DetenerTiempo dt) {
		// TODO Auto-generated method stub
		
	}


	public void visitarArmaBasica(ArmaBasica ab) {
		// TODO Auto-generated method stub
		
	}


	public void visitarSuperArma(SuperArma ab) {
		// TODO Auto-generated method stub
		
	}


	public void visitarParticula(ProyectilBeta p) {
		// TODO Auto-generated method stub
		
	}
}
