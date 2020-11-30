package Visitor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import EntidadLogica.ProyectilPersonajePrincipal;
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
import EntidadGrafica.EntidadGraficaProyectilPersonajePrincipal;

public class VisitorMejorarArma extends Visitor {
	
	public VisitorMejorarArma(Entidad entidad) {
		super(entidad);
		// TODO Auto-generated constructor stub
	}
	
	public void visitarPersonajePrincipal(PersonajePrincipal pp) {
    	entidadActual.getJuego().EliminarEntidades(entidadActual);
		EntidadGraficaProyectilPersonajePrincipal entidadGrafica = (EntidadGraficaProyectilPersonajePrincipal) pp.getEntidadGrafica();
		int danioAnterior = pp.getProyectil().getDanio();
		pp.getProyectil().setDanio(danioAnterior*2);
		pp.getEntidadGrafica().agregarImagen(entidadGrafica.getImagenSuperArma());
		ActionListener accion = new ActionListener() {
    		public void actionPerformed(ActionEvent ae) {
    			
    		}
    	};
    	Timer timer = new Timer(((MejorarArma) entidadActual).getTiempo(), accion);
    	timer.start();
    	pp.getProyectil().setDanio(danioAnterior);
		pp.getEntidadGrafica().agregarImagen(entidadGrafica.getImagenDefault());
	}
}
