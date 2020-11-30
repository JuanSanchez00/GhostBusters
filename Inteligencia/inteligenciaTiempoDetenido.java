package Inteligencia;

import java.awt.event.KeyEvent;

import EntidadLogica.Entidad;

public class InteligenciaTiempoDetenido extends Inteligencia{

	public InteligenciaTiempoDetenido(Entidad entidad , Inteligencia anterior){
		super(entidad,anterior);
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
	
	public Inteligencia getInteligenciaAnterior() {
		return inteligenciaAnterior;
	}
}
