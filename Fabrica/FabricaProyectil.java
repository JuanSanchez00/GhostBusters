package Fabrica;

import EntidadLogica.EntidadProyectil;
import Juego.Juego;

public abstract class FabricaProyectil {
	protected Juego juego;
	
	public FabricaProyectil(Juego j){
		juego = j;
	}
	
	public abstract EntidadProyectil devolverProyectil(int x, int y);
}
