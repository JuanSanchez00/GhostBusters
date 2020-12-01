package Juego;

import Fabrica.FabricaPortadorAlpha;
import Fabrica.FabricaPortadorBeta;

public class Nivel1 extends Nivel {
	
	public Nivel1(Juego juego){
		super(juego);
		cantidad = new int[2];
		cantidad[0] = 1;
		cantidad[1] = 1;
		siguiente = new Nivel2(juego);
		listaFabricas.add(new FabricaPortadorAlpha(juego));
		listaFabricas.add(new FabricaPortadorBeta(juego));
		cantOleadas = 2;
		mapa = "src\\Graficas\\Mapas\\mapa1.png";
	}
	

}
