package Visitor;

import EntidadLogica.*;

public class VisitorProyectilBeta extends Visitor {
	
	public VisitorProyectilBeta(Entidad entidad) {
		super(entidad);
		// TODO Auto-generated constructor stub
	}

	public void visitarPersonajePrincipal(PersonajePrincipal pp) {
		/*((ProyectilBeta) entidadActual).daniar(pp);
		entidadActual.desaparecer();
		entidadActual.eliminar();*/
	}	
}
