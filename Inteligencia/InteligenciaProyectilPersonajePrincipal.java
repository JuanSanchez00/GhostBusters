package Inteligencia;

import java.awt.event.KeyEvent;

import EntidadLogica.Entidad;

public class InteligenciaProyectilPersonajePrincipal extends Inteligencia {

	public InteligenciaProyectilPersonajePrincipal(Entidad entidad) {
		super(entidad,null);
	}
	
	public void accionar() {
        int y = entidad.getEntidadGrafica().getPosicionY();
        int x = entidad.getEntidadGrafica().getPosicionX();
        int velocidad = entidad.getVelocidad();
        if (y>=0) {//si esta en el mapa
            y = y - velocidad;
            entidad.getEntidadGrafica().getJLabel().setLocation(x, y);
            entidad.getEntidadGrafica().setPosicionY(y);
        }
        else {//se fue del mapa
           // entidad.desaparecer();
           // entidad.eliminar();
        }
    }

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
