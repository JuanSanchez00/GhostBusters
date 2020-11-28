package EntidadGrafica;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import EntidadLogica.Entidad;
import Juego.Juego;

public class EntidadGraficaProyectilPersonajePrincipal extends EntidadGrafica{

    public EntidadGraficaProyectilPersonajePrincipal(Entidad entidad,int x,int y){
        super(entidad);
        this.imagenes = new String[]{"src\\Graficas\\Proyectiles\\ProyectilBasico.gif","src\\Graficas\\Proyectiles\\SuperProyectil.gif"};
        this.label.setSize(50,50);
        this.altura = 50;
        this.ancho = 50;
        agregarImagen(this.getImagenDefault());
        posicionX = x-ancho/2;
        posicionY = y;
		this.label.setLocation(posicionX,posicionY);
    }

    public ImageIcon getImagenSuperArma() {
        return new ImageIcon(this.getClass().getResource(this.imagenes[1]));
    }
}
