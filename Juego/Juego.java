package Juego;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import javax.swing.JPanel;

import EntidadLogica.*;
import Fabrica.*;
import GUI.InterfazJuego;
import Inteligencia.InteligenciaTiempoDetenido;

public class Juego {
	private List<Entidad> listaEntidades;
	private Nivel nivelActual;
	private int ancho,altura;
	private InterfazJuego mapa;
	private int cantNiveles;
	
	public Juego(InterfazJuego mapa) {
		nivelActual = new Nivel1(this);
		listaEntidades = new LinkedList<Entidad>();
		ancho = 700;
		altura = 1000;	
		this.mapa = mapa;
		this.cantNiveles = 2;
	}
	
	public void inicializarNivel() {
		//listaEntidades.add(new PersonajePrincipal(this));
		nivelActual.cargarEnemigos();
	}
	
	public void chequearNivel() {
		if (nivelActual.enemigosMuertos()) {//si ya no quedan enemigos vivos en el nivel actual
			if (nivelActual.getOleadaActual() == nivelActual.getCantOleadas()) {
				if (nivelActual.getNivelSiguiente() != null) {
					nivelActual = nivelActual.getNivelSiguiente();
				}
				else {
					//gano
				}
			}
			else {
				nivelActual.cargarEnemigos();
			}
		}
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
			e.setInteligencia(new InteligenciaTiempoDetenido(e));
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
	
	public void accionarEntidades() {
		for(Entidad e : listaEntidades) {
			e.accionar();
		}
	}
}
