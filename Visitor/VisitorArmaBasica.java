package Visitor;

import EntidadLogica.*;

public class VisitorArmaBasica extends Visitor {
	
	public VisitorArmaBasica(Entidad entidad) {
		super(entidad);
		// TODO Auto-generated constructor stub
	}


	public void visitarPortadorAlpha(PortadorAlpha pa) {
		((ArmaBasica) entidadActual).daniar(pa);
		entidadActual.desaparecer();
		entidadActual.eliminar();
	}


	public void visitarPortadorBeta(PortadorBeta pb) {
		((ArmaBasica) entidadActual).daniar(pb);
		entidadActual.desaparecer();
		entidadActual.eliminar();
		
	}


}
