package Hilos;

import Juego.Juego;

public class MovimientoEntidades extends Thread {
	protected Juego juego;
	
	public MovimientoEntidades(Juego juego) {
		this.juego = juego;
	}
	
	public void run() {
		while(true) {
			try {
				this.sleep(1000);
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			juego.accionarEntidades();
		}
	}
}
