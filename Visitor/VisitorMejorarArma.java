package Visitor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

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
import EntidadLogica.SuperArma;

public class VisitorMejorarArma extends Visitor {
	
	public VisitorMejorarArma(Entidad entidad) {
		super(entidad);
		// TODO Auto-generated constructor stub
	}
	
	public void visitarPersonajePrincipal(PersonajePrincipal pp) {
		EntidadProyectil armaAnterior = pp.getProyectil();
		SuperArma superArma = new SuperArma(pp.getJuego());
		pp.setProyectil(superArma); 
		pp.getJuego().getListaEntidades().add(superArma);
		ActionListener accion = new ActionListener() {
    		public void actionPerformed(ActionEvent ae) {
    			
    		}
    	};
    	Timer timer = new Timer(((MejorarArma) entidadActual).getTiempo(), accion);
    	timer.start();
		pp.setProyectil(armaAnterior);
		entidadActual.desaparecer();
		entidadActual.eliminar();
		superArma.desaparecer();
		superArma.eliminar();
	}

	public void visitarPortadorAlpha(PortadorAlpha pa) {
		// TODO Auto-generated method stub
		
	}


	public void visitarPortadorBeta(PortadorBeta pb) {
		// TODO Auto-generated method stub
		
	}


	public void visitarPocion(Pocion p) {
		// TODO Auto-generated method stub
		
	}


	public void visitarMejorarArma(MejorarArma ma) {
		// TODO Auto-generated method stub
		
	}


	public void visitarDetenerTiempo(DetenerTiempo dt) {
		// TODO Auto-generated method stub
		
	}


	public void visitarArmaBasica(ArmaBasica ab) {
		// TODO Auto-generated method stub
		
	}


	public void visitarSuperArma(SuperArma ab) {
		// TODO Auto-generated method stub
		
	}


	public void visitarParticula(ProyectilBeta p) {
		// TODO Auto-generated method stub
		
	}
}
