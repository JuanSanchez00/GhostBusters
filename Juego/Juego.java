package Juego;
import java.util.List;

import javax.swing.JPanel;

import EntidadLogica.*;
import Fabrica.*;

public class Juego {
	private List<Entidad> listaEntidades;
	private Nivel nivelActual;
	private boolean tiempoDetenido;
	private int ancho,altura;
	private JPanel mapa;
	
	public Juego() {
		nivelActual = new Nivel1();
		listaEntidades = nivelActual.getListaEntidades();
		tiempoDetenido = false;
		
	}
	
	public JPanel getMapa() {
		return mapa;
	}
	
	public void verificarColisiones() {
		
	}
	
	public List<Entidad> getListaEntidades() {
		return listaEntidades;
	}
	
	public boolean getTiempoDetenido() {
		return tiempoDetenido;
	}
	
	public int getAltura() {
		return altura;
	}
	
	public int getAncho() {
		return ancho;
	}
	public void setTiempoDetenido(boolean b) {
		this.tiempoDetenido = b;
	}
}
