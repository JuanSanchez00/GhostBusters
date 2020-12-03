package Fabrica;

import EntidadLogica.ArmaBasica;
import EntidadLogica.EntidadProyectil;
import Juego.Juego;

public class FabricaProyectilBasico extends FabricaProyectil{

	public FabricaProyectilBasico(Juego j){
		super(j);
	}
	public EntidadProyectil devolverProyectil(int x, int y){
		return new ArmaBasica(juego, x,y);
	}

}
