package Visitor;

import EntidadLogica.ProyectilPersonajePrincipal;
import EntidadLogica.DetenerTiempo;
import EntidadLogica.Entidad;
import EntidadLogica.MejorarArma;
import EntidadLogica.ProyectilBeta;
import EntidadLogica.PersonajePrincipal;
import EntidadLogica.Pocion;
import EntidadLogica.PortadorAlpha;
import EntidadLogica.PortadorBeta;

public class VisitorPocion extends Visitor{

	public VisitorPocion(Entidad entidad) {
		super(entidad);
		// TODO Auto-generated constructor stub
	}
}
