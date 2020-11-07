package EntidadLogica;

import EntidadGrafica.EntidadGrafica;
import Inteligencia.Inteligencia;
import Visitor.Visitor;

public class SuperArma extends ProyectilSanitario {

	@Override
	public void aceptarVisitor(Visitor v) {
		v.visitarSuperArma(this);
	}
}
