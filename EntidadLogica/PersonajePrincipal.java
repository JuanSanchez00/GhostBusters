package EntidadLogica;

import EntidadGrafica.*;
import Inteligencia.*;
import Visitor.*;

public class PersonajePrincipal extends EntidadPersonaje{
	
	@Override
	public void aceptarVisitor(Visitor v) {
		v.visitarPersonajePrincipal(this);
	}
}
