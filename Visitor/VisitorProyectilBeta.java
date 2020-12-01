package Visitor;

import EntidadLogica.*;

public class VisitorProyectilBeta extends Visitor {
	protected ProyectilBeta entidadActual;
	public VisitorProyectilBeta(ProyectilBeta entidad) {
		entidadActual = entidad;
		// TODO Auto-generated constructor stub
	}

	public void visitarPersonajePrincipal(PersonajePrincipal pp) {
		/*((ProyectilBeta) entidadActual).daniar(pp);
		entidadActual.desaparecer();
		entidadActual.eliminar();*/
	}	
}
