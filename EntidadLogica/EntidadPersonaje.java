package EntidadLogica;

public abstract class EntidadPersonaje extends Entidad {
	protected int cargaViral;
	protected EntidadProyectil proyectil;
	
	public int getCargaViral() {
		return this.cargaViral;
	}
	
	public void setCargaViral(int cv) {
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
	
	public void morir() {
		
	}
	
	/*public void disparar();
	public void morir();*/
	
	
}
