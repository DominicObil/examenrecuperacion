package ev2.recuperacion;

public class Propietario {
	


	private String telefono;
	private String nombre;
	
	
	public Propietario(String telefono, String nombre) {
		super();
		this.telefono = telefono;
		this.nombre = nombre;
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Propietario [telefono=" + telefono + ", nombre=" + nombre + "]";
	}


}
