package ev2.recuperacion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Consulta {

	

	protected String fecha;
	protected int Id;
	protected String diagnostico;
	protected HashSet<Medicamentos> lista_medicamentos;
	public Consulta(String fecha, int id, String diagnostico) {
		
		
		this.fecha = fecha;
		Id = id;
		this.diagnostico = diagnostico;
		this.lista_medicamentos = new HashSet<Medicamentos>();// suponindo que no se repiten medicamentos, si no arrayList
	}
	
	public void addMedicamentos(Medicamentos medicamentos) {
		
		lista_medicamentos.add(medicamentos);
		
	}
	
	
	public void delMedicamentos(Medicamentos medicamentos) {
		
		lista_medicamentos.remove(medicamentos);
		
	}
	
	
	
	
	@Override
	public String toString() {
		return "Consulta [fecha=" + fecha + ", Id=" + Id + ", diagnostico=" + diagnostico + ", lista_medicamentos="
				+ lista_medicamentos + "]";
	}

	
	
}
