package Visitor;

import EntidadLogica.ArmaBasica;
import EntidadLogica.DetenerTiempo;
import EntidadLogica.Entidad;
import EntidadLogica.MejorarArma;
import EntidadLogica.PersonajePrincipal;
import EntidadLogica.Pocion;
import EntidadLogica.PortadorAlpha;
import EntidadLogica.PortadorBeta;
import EntidadLogica.ProyectilAlpha;
import EntidadLogica.ProyectilBeta;
import EntidadLogica.SuperArma;

public class VisitorProyectilAlpha extends Visitor {
	
	public VisitorProyectilAlpha(Entidad entidad) {
		super(entidad);
		// TODO Auto-generated constructor stub
	}
	
	public void visitarPersonajePrincipal(PersonajePrincipal pp) {
		((ProyectilAlpha) entidadActual).daniar(pp);//PREGUNTAR SI ESTA BIEN EL CASTEO
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
