package Visitor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import EntidadLogica.SuperArma;
import EntidadLogica.ArmaBasica;
import EntidadLogica.DetenerTiempo;
import EntidadLogica.EfectoTemporal;
import EntidadLogica.Entidad;
import EntidadLogica.EntidadProyectil;
import EntidadLogica.MejorarArma;
import EntidadLogica.ProyectilBeta;
import EntidadLogica.PersonajePrincipal;
import EntidadLogica.Pocion;
import EntidadLogica.PortadorAlpha;
import EntidadLogica.PortadorBeta;

public class VisitorMejorarArma extends Visitor {
	protected MejorarArma entidadActual;
	private Timer timer;
	public VisitorMejorarArma(MejorarArma entidad) {
		entidadActual = entidad;
		// TODO Auto-generated constructor stub
	}
	
	public void visitarPersonajePrincipal(PersonajePrincipal pp) {
		entidadActual.getJuego().EliminarEntidades(entidadActual);
		pp.setProyectil(new SuperArma(pp.getJuego(),0,0));
		ActionListener accion = new ActionListener() {
    		public void actionPerformed(ActionEvent ae) {
    			pp.setProyectil(new ArmaBasica(pp.getJuego(),0,0));
    			timer.stop();
    		}
    	};
    	timer = new Timer( entidadActual.getTiempo(), accion);
    	timer.start();
		
		
		
    	/*entidadActual.getJuego().EliminarEntidades(entidadActual);
		EntidadGraficaProyectilPersonajePrincipal entidadGraficaProyectil = (EntidadGraficaProyectilPersonajePrincipal) pp.getProyectil().getEntidadGrafica();
		int danioAnterior = pp.getProyectil().getDanio();
		pp.getProyectil().setDanio(danioAnterior*2);
		System.out.println("Nuevo daño: "+pp.getProyectil().getDanio());
		entidadGraficaProyectil.agregarImagen(entidadGraficaProyectil.getImagenSuperArma());
		ActionListener accion = new ActionListener() {
    		public void actionPerformed(ActionEvent ae) {
    			pp.getProyectil().setDanio(danioAnterior);
    			entidadGraficaProyectil.agregarImagen(entidadGraficaProyectil.getImagenDefault());
    			timer.stop();
    		}
    	};
    	timer = new Timer( entidadActual.getTiempo(), accion);
    	timer.start();*/
    	
    	
	}
}
