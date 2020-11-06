package EntidadLogica;

public abstract class EntidadPersonaje extends Entidad {
	protected float cargaViral;
	protected EntidadProyectil proyectil;
	
	public abstract float getCargaViral();
	public abstract void setCargaViral(float cv);
	public abstract EntidadProyectil getProyectil();
	public abstract void disparar();
	public abstract boolean estaVivo();
	public abstract void morir();
}
