package EntidadLogica;

import EntidadGrafica.*;
import Inteligencia.*;
import Visitor.*;
import Juego.*;

public class ProyectilPersonajePrincipal extends ProyectilSanitario{

    public ProyectilPersonajePrincipal(Juego juego){
        super(juego);
        visitor = new VisitorProyectilPersonajePrincipal(this);
        entidadGrafica = new EntidadGraficaProyectilPersonajePrincipal(this);
        velocidad = 1;
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
