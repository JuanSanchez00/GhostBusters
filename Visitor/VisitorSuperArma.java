package Visitor;

import EntidadLogica.*;

public class VisitorSuperArma extends Visitor {

	public VisitorSuperArma(Entidad entidad) {
		super(entidad);
		// TODO Auto-generated constructor stub
	}

	public void visitarPortadorAlpha(PortadorAlpha pa) {
		((SuperArma) entidadActual).daniar(pa);
		entidadActual.desaparecer();
		entidadActual.eliminar();
	}


	public void visitarPortadorBeta(PortadorBeta pb) {
		((SuperArma) entidadActual).daniar(pb);
		entidadActual.desaparecer();
		entidadActual.eliminar();
		
	}
}

