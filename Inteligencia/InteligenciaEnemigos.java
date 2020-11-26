package Inteligencia;

import java.awt.event.KeyEvent;

import EntidadLogica.Entidad;

public class InteligenciaEnemigos extends Inteligencia {

	public InteligenciaEnemigos(Entidad entidad) {
		super(entidad);
	}
	
	public void accionar(){
        int y = entidad.getEntidadGrafica().getPosicionY();
        int alturaEntidad = entidad.getEntidadGrafica().getAltura();
        int alturaJuego = entidad.getJuego().getAltura();
        int velocidad = entidad.getVelocidad();
        //si supera la altura del juego, arranca en la parte superior en -alturaEntidad
        y = y + velocidad <= alturaJuego ? y + velocidad : -alturaEntidad;
        int x = entidad.getEntidadGrafica().getPosicionX();
        entidad.getEntidadGrafica().getJLabel().setLocation(x, y);
        entidad.getEntidadGrafica().setPosicionY(y);
    }

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
