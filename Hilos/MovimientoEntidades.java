package Hilos;

import EntidadLogica.PersonajePrincipal;
import Juego.Juego;

public class MovimientoEntidades extends Thread {
	protected Juego juego;
	protected PersonajePrincipal personaje;
	
	public MovimientoEntidades(Juego juego,PersonajePrincipal personaje) {
		this.juego = juego;
		this.personaje = personaje;
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
			juego.verificarColisiones();
			juego.accionarEntidades();
			juego.getListaEntidades().addAll(juego.getEntidadesEnEspera());
			juego.getListaEntidades().removeAll(juego.getEntidadesEliminar());
			juego.reiniciarListas();
			juego.chequearNivel();
			System.out.println(personaje.getCargaViral());
		}
	}
}
