package Visitor;

import EntidadLogica.ProyectilPersonajePrincipal;
import EntidadLogica.DetenerTiempo;
import EntidadLogica.Entidad;
import EntidadLogica.MejorarArma;
import EntidadLogica.PersonajePrincipal;
import EntidadLogica.Pocion;
import EntidadLogica.PortadorAlpha;
import EntidadLogica.PortadorBeta;
import EntidadLogica.ProyectilAlpha;
import EntidadLogica.ProyectilBeta;

public class VisitorProyectilAlpha extends Visitor {
	
	public VisitorProyectilAlpha(Entidad entidad) {
		super(entidad);
		// TODO Auto-generated constructor stub
	}
	
	public void visitarPersonajePrincipal(PersonajePrincipal pp) {
		/*((ProyectilAlpha) entidadActual).daniar(pp);//PREGUNTAR SI ESTA BIEN EL CASTEO
		entidadActual.desaparecer();
		entidadActual.eliminar();*/
	}
}
