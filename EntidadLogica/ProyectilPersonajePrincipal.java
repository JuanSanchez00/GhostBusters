package EntidadLogica;

import EntidadGrafica.*;
import Inteligencia.*;
import Visitor.*;
import Juego.*;

public class ProyectilPersonajePrincipal extends ProyectilSanitario{

    public ProyectilPersonajePrincipal(Juego juego,int x, int y){
        super(juego);
        visitor = new VisitorProyectilPersonajePrincipal(this);
        entidadGrafica = new EntidadGraficaProyectilPersonajePrincipal(this,x,y);
        velocidad = 100;
        System.out.println("D");
    }

    @Override
    public void aceptarVisitor(Visitor v) {
        v.visitarProyectilPersonajePrincipal(this);
    }

    public void setDanio(int danio) {
        this.danio = danio;
    }

    @Override
    public void daniar(EntidadPersonaje ep) {
        int nuevaCargaViral = ep.cargaViral - danio;
        if(nuevaCargaViral <= 0) {
            ep.morir();
        }
        else {
            ep.setCargaViral(nuevaCargaViral);
        }
    }

}
