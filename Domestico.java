package ev2.recuperacion;

public abstract class   Domestico extends Animal{

	protected String nombre;
	protected int edad;
	protected String raza;
	protected String chip;
	
	
	public Domestico(Sexo sexo, String peso, Propietario prop, String nombre, int edad, String raza, String chip) {
		super(sexo, peso, prop);
		this.nombre = nombre;
		this.edad = edad;
		this.raza = raza;
		this.chip = chip;
	
	}
	
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	public String getRaza() {
		return raza;
	}





	
	public abstract void cortarUñas();
	

	
	
}
