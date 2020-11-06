package Visitor;

import EntidadLogica.*;

public abstract class Visitor {
	public abstract void visitarPersonajePrincipal(PersonajePrincipal pp);
	public abstract void visitarPortadorAlpha(PortadorAlpha pa);
	public abstract void visitPortadorBeta(PortadorBeta pb);
	public abstract void visitarPocion(Pocion p);
	public abstract void visitarMejorarArma(MejorarArma ma);
	public abstract void visitarDetenerTiempo(DetenerTiempo dt);
	public abstract void visitarArmaBasica(ArmaBasica ab);
	public abstract void visitarSuperArma(SuperArma ab);
	public abstract void visitarParticula(Particula p);
}
