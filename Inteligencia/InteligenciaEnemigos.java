package Inteligencia;

import java.awt.event.KeyEvent;
import java.util.Random;

import EntidadLogica.Enemigo;
import EntidadLogica.Entidad;

public class InteligenciaEnemigos extends Inteligencia {
	
	private int delay;
	
	public InteligenciaEnemigos(Entidad entidad) {
		super(entidad);
		Random rnd = new Random();
		delay = rnd.nextInt(10)+5;
	}
	
	public void accionar(){
		Random rnd = new Random();
		if(delay == 0){
			Enemigo e = (Enemigo) entidad;
			entidad.getJuego().CrearProyectil(e.getNuevoProyectil());
			delay = rnd.nextInt(10)+5;
		}else{
			delay--;
		}
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
