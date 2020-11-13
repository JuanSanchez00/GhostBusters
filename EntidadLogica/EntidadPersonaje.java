package EntidadLogica;

public abstract class EntidadPersonaje extends Entidad {
	protected float cargaViral;
	protected EntidadProyectil proyectil;
	
	public float getCargaViral() {
		return this.cargaViral;
	}
	
	public void setCargaViral(float cv) {
		this.cargaViral = cv;
	}
	
	public EntidadProyectil getProyectil() {
		return this.proyectil;
	}
	
	public void setProyectil(EntidadProyectil ps) {
		this.proyectil = ps;
	}
	public boolean estaVivo() {
		return cargaViral != 0;
	}
	
	/*public void disparar();*/
	public void morir() {
		this.getEntidadGrafica().
	}
	
	
}
