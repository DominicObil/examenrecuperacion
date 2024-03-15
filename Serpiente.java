package ev2.recuperacion;

public class Serpiente extends Animal {
	
	protected String especia;
	protected Boolean veneno;
	
	
	public Serpiente(Sexo sexo, String peso, Propietario prop, String especia, Boolean veneno) {
		super(sexo,peso, prop);
		this.especia = especia;
		this.veneno = veneno;
	}
	
	

}
