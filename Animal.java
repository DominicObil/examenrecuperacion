package ev2.recuperacion;

public abstract class Animal {


	protected static int cuantos=0;
	protected static int ID = 0;
	enum Sexo{
		MACHO,HEMBRA
	};
	protected Sexo sexo;
	protected Propietario prop;
	protected String peso;
	public Animal(Sexo sexo, String peso, Propietario prop) {
		
		this.cuantos++;
		this.ID= cuantos;
		this.sexo = sexo;
		this.peso= peso;
		this.prop = prop;
		
		
	}
	
	
	
	
	
	public String getPeso() {
		return peso;
	}
	
	public static int getId() {
		return ID;
	}
	public static void setId(int id) {
		ID = id;
	}
	
	
	
	
	
	
	

}
