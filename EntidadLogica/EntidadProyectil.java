package EntidadLogica;

public abstract class EntidadProyectil extends Entidad {
	private float danio;
	
	public float getDanio() {
		return danio;
	}
	
	public abstract void daniar(EntidadPersonaje ep);
}
