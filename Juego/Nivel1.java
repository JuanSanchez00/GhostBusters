package Juego;

public class Nivel1 extends Nivel {
	
	public Nivel1(Juego juego){
		super(juego);
		cantidad = new int[2];
		cantidad[0] = 10;
		cantidad[1] = 15;
		siguiente = new Nivel2(juego);
	}
	
}
