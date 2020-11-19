package Inteligencia;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import EntidadLogica.Entidad;

public class InteligenciaPersonajePrincipal extends Inteligencia{

    public InteligenciaPersonajePrincipal(Entidad entidad) {
        super(entidad);
    }

    public void keyPressed(KeyEvent arg0) {
        switch(arg0.getKeyCode()) {
            case KeyEvent.VK_LEFT:
            case KeyEvent.VK_A: {
                moverIzquierda();
                break;
            }
            case KeyEvent.VK_RIGHT:
            case KeyEvent.VK_D: {
                moverDerecha();
                break;
            }
            case KeyEvent.VK_SPACE:
            case KeyEvent.VK_ENTER: {
                //((PersonajePrincipal) entidad).disparar();
                break;
            }
        }
    }

    public void moverDerecha() {
        int x = entidad.getEntidadGrafica().getPosicionX();
        int anchoEntidad = entidad.getEntidadGrafica().getAncho();
        int anchoJuego = entidad.getJuego().getAncho();
        int velocidad = entidad.getVelocidad();
        x = x + anchoEntidad + velocidad <= anchoJuego ? x + velocidad : anchoJuego - anchoEntidad;
        int y = entidad.getEntidadGrafica().getPosicionY();
        entidad.getEntidadGrafica().getJLabel().setLocation(x, y);
        entidad.getEntidadGrafica().setPosicionX(x);
    }

    public void moverIzquierda() {
        int x = entidad.getEntidadGrafica().getPosicionX();
        int velocidad = entidad.getVelocidad();
        x = x  - velocidad >= 0 ? x  - velocidad : 0;
        int y = entidad.getEntidadGrafica().getPosicionY();
        entidad.getEntidadGrafica().getJLabel().setLocation(x, y);
        entidad.getEntidadGrafica().setPosicionX(x);

    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }

}
