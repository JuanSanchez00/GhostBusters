package Inteligencia;

import java.awt.event.KeyEvent;

import EntidadLogica.Entidad;

public class InteligenciaPremio extends Inteligencia{

	public InteligenciaPremio(Entidad entidad) {
		super(entidad,null);
	}

	public void accionar() {
		int y = entidad.getEntidadGrafica().getPosicionY();
		int x = entidad.getEntidadGrafica().getPosicionX();
        int alturaJuego = entidad.getJuego().getAltura();
        int velocidad = entidad.getVelocidad();
        if(y + velocidad >= alturaJuego){
        	entidad.desaparecer();
			//entidad.eliminar();
        }
        else{
        	y = y + velocidad;
			entidad.getEntidadGrafica().setPosicionY(y);
			entidad.getEntidadGrafica().getJLabel().setLocation(x, y);
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
