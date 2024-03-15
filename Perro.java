package ev2.recuperacion;

public class Perro extends Domestico implements Comparable<Perro> {

	
	
	
	protected Double resta=0.50;
	public Perro(Sexo sexo,String peso, Propietario prop, String nombre, int edad, String raza, String chip) {
		super(sexo,peso, prop, nombre, edad, raza, chip);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	public void damePatita() {
		
		System.out.println("El perro "+ getNombre() +" te da la patita");
		
		
		
		
	}
/*
	@Override
	public void cortarUñas() {
		 this.getPeso() = peso-resta;
		return this.getPeso() ;
		
	}

*///No me va ir por que puse peso como string, igual en gato, me di cuenta al final 

	
	
	


	@Override
	public int compareTo(Perro o) {
		// TODO Auto-generated method stub
		return this.getRaza().compareTo(o.getRaza());
	}





	@Override
	public void cortarUñas() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
