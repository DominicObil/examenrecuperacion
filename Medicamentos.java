package ev2.recuperacion;

public class Medicamentos implements Comparable<Medicamentos>{
	


	protected String nombre;
	protected Double gramos;
	protected Double precio;
	
	
	public Medicamentos(String nombre, Double gramos, Double precio) {
		super();
		this.nombre = nombre;
		this.gramos = gramos;
		this.precio = precio;
	}

	
	public Double getGramos() {
		return gramos;
	}


	@Override
	public int compareTo(Medicamentos o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	/*
	@Override
	public int compareTo(Medicamentos o1,  Medicamentos o2) {
	 
		
		
		return (int) (o2.getGramos()-o1.getGramos());
	}
	
	
	
	  */




	@Override
	public String toString() {
		return "Medicamentos [nombre=" + nombre + ", gramos=" + gramos + ", precio=" + precio + "]";
	}



}
