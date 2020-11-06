package Juego;
import java.util.List;
import EntidadLogica.*;
import Fabrica.*;

public class Juego {
	private List<EntidadPersonaje> listaEntidades;
	private List<FabricaEnemigo> listaFrabricas;
	private Nivel nivelActual;
	
	public void verificarColisiones() {
		
	}
	
	public List<EntidadPersonaje> getListaEntidades() {
		return listaEntidades;
	}
}
