package EntidadLogica;

public abstract class EntidadProyectil extends Entidad {
	private int danio;
	
	public int getDanio() {
		return danio;
	}
	
	public abstract void daniar(EntidadPersonaje ep);
}
