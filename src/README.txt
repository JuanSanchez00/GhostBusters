Link del diagrama UML: https://app.diagrams.net/#G1MgRNIAZHvKYVePjHX-N3VrW_0IHa6tiN

Pseudocodigos:

Movimiento personaje principal: ya está implementado.

Movimento infectados:

Juego: 
    Metodo ActualizarInfectados: Por cada infectado de la lista de entidades en juegos llamo a su metodo mover. (Este metodo tendria que estar en un hilo en Juego).

EntidadInfectado:
    Metodo mover: usa su atributo que guarda a la inteligencia del infectado para llamar al metodo mover de dicha inteligencia.

InteligenciaInfectado:
    Metodo mover: cambia la posicion del label que guarda la imagen del enemigo, desplanzandolo hacia abajo de acuerdo a su velocidad. En el caso de que de que el label se pase del limite del mapa por la parte de abajo, es rehubicado en la parte de arriba para volve a hacer el mismo recorrido.



Generacion del mapa:

InterfazJuego: 
    InicializarMapa: Se crea un jpanel donde va a tener como fondo una imagen que haria de interfaz grafica del mapa, este va a tener un tamaño predeterminado. Ademas va a llamar al metodo iniciarJuego.

Juego: 
    iniciarJuego: va a crear y agregar a su lista de entidades un PersonajePrincipal al cual le va a asignar como posicion inicial la mitad de la parte inferior del mapa. Luego el juego va a usar al atributo que guarda su nivel para acceder a la fabrica de enemigos y crear nuevas entidadesInfectados, las posiciones de estas entidades van a ser aleatoreas para x y van a ser la parte superior del mapa para y.