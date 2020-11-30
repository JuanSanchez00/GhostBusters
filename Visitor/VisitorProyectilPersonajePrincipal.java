package Visitor;

import EntidadLogica.*;

public class VisitorProyectilPersonajePrincipal extends Visitor {
	
	public VisitorProyectilPersonajePrincipal(Entidad entidad) {
		super(entidad);
		// TODO Auto-generated constructor stub
	}


	public void visitarPortadorAlpha(PortadorAlpha pa) {
		((ProyectilPersonajePrincipal) entidadActual).daniar(pa);
		entidadActual.getJuego().EliminarEntidades(entidadActual);
	}


	public void visitarPortadorBeta(PortadorBeta pb) {
		((ProyectilPersonajePrincipal) entidadActual).daniar(pb);
		entidadActual.getJuego().EliminarEntidades(entidadActual);
	}


}
