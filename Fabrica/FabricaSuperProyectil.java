package Fabrica;

import EntidadLogica.EntidadProyectil;
import EntidadLogica.SuperArma;
import Juego.Juego;

public class FabricaSuperProyectil extends FabricaProyectil{

	public FabricaSuperProyectil(Juego j){
		super(j);
	}
	public EntidadProyectil devolverProyectil(int x, int y){
		return new SuperArma(juego, x,y);
	}

}
