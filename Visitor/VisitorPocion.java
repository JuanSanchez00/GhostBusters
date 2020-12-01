package Visitor;

import EntidadLogica.DetenerTiempo;
import EntidadLogica.Entidad;
import EntidadLogica.MejorarArma;
import EntidadLogica.ProyectilBeta;
import EntidadLogica.PersonajePrincipal;
import EntidadLogica.Pocion;
import EntidadLogica.PortadorAlpha;
import EntidadLogica.PortadorBeta;

public class VisitorPocion extends Visitor{
	protected Pocion entidadActual;
	
	public VisitorPocion(Pocion entidad) {
		entidadActual = entidad;
		// TODO Auto-generated constructor stub
	}
}
