package Juego;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import javax.swing.JPanel;

import EntidadLogica.*;
import Fabrica.*;
import GUI.InterfazJuego;
import Inteligencia.inteligenciaTiempoDetenido;

public class Juego {
	private List<Entidad> listaEntidades;
	private Nivel nivelActual;
	private int ancho,altura;
	private InterfazJuego mapa;
	
	public Juego(InterfazJuego mapa) {
		nivelActual = new Nivel1(this);
		listaEntidades = new LinkedList<Entidad>();
		ancho = 700;
		altura = 700;	
		this.mapa = mapa;
	}
	
	public InterfazJuego getMapa() {
		return mapa;
	}
	
	public void verificarColisiones() {
		for (Entidad entidad1 : listaEntidades) {
			for (Entidad entidad2 : listaEntidades) {
				if (entidad1.getEntidadGrafica().getRectangulo().intersects(entidad2.getEntidadGrafica().getRectangulo())) {
					entidad1.aceptarVisitor(entidad2.getVisitor());
				}
			}
		}
	}
	
	public List<Entidad> getListaEntidades() {
		return listaEntidades;
	}
	
	public int getAltura() {
		return altura;
	}
	
	public int getAncho() {
		return ancho;
	}
	
	public void detenerTiempo() {
		for(Entidad e : listaEntidades){
			e.setInteligencia(new inteligenciaTiempoDetenido(e));
		}
	}
	
	public void reanudarTiempo() {
		for(Entidad e : listaEntidades){
			e.setInteligencia(e.getInteligencia().getInteligenciaAnterior());
		}
	}

	public EntidadPremio getPremio() {
        EntidadPremio premio = null;
        Random rnd = new Random();
        int indice = rnd.nextInt(3);
        switch(indice) {
            case 0: 
                premio = new DetenerTiempo(this);
                break;
            case 1: 
                premio = new MejorarArma(this);
                break;
            case 2: 
                premio = new Pocion(this);
                break;
        }
        return premio;
    }
}
