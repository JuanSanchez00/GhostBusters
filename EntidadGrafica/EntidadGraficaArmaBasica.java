package EntidadGrafica;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import EntidadLogica.Entidad;
import Juego.Juego;

public class EntidadGraficaArmaBasica extends EntidadGrafica{

    public EntidadGraficaArmaBasica(Entidad entidad,int x,int y){
        super(entidad);
        this.imagenes = new String[]{"src\\Graficas\\Proyectiles\\ProyectilBasico.gif"};
        this.label.setSize(50,50);
        this.altura = 50;
        this.ancho = 50;
        agregarImagen(this.getImagenDefault());
        posicionX = x-ancho/2;
        posicionY = y;
		this.label.setLocation(posicionX,posicionY);
    }

 
}
