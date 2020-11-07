package Juego;
import java.util.List;
import EntidadLogica.*;
import Fabrica.*;

public class Juego {
	private List<EntidadPersonaje> listaEntidades;
	private Nivel nivelActual;
	
	public Juego() {
		nivelActual = new Nivel1();
		listaEntidades = nivelActual.getListaEntidades();
	}
	
	public void verificarColisiones() {
		
	}
	
	public List<EntidadPersonaje> getListaEntidades() {
		return listaEntidades;
	}
}
