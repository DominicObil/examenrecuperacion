package ev2.recuperacion;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Clinica {

	public static int contador = 0;
	protected Map<Integer,Set<Consulta>>mapa_consulta;
	protected Animal animal;
	

	// Construcotr inicializo el map
	public Clinica() {
		
		this.mapa_consulta = new HashMap<Integer,Set<Consulta>>();
		
		
	}
	// añadir animal
	public void addAnimales(Integer integer, Consulta consulta ) {
		
		
		
		if(!mapa_consulta.containsKey(integer)) {
			
			mapa_consulta.put(integer,new HashSet());
			
		}
		mapa_consulta.get(integer).add(consulta);
		
		contador++;
		
	
	}
	// animales totales
	public int cuantosAnimales() {
		return contador;
	}
	
	public void perrosByRaza(Perro perro ) {
		
	// ordenado por raza
		Set<Animal>lista_perro= new TreeSet<>();
		lista_perro.add(perro);
		
		System.out.println("la lista de perros ordenados por raza : "+ lista_perro);
		
		
		}
		
	
	
	// consultas
	public void getConsultas(Integer integer,Consulta consulta) {
	
		
		
		System.out.println(mapa_consulta);
	}
	
	
	
	// Medicamentos ordenado de manera ascendente
	public void getMedicamentosByPeso(Medicamentos medicamentos) {

		Set<Medicamentos>lista_medicamentos = new TreeSet<>();
		lista_medicamentos.add(medicamentos);
		System.out.println("lista_medicamentos ordenados por gramo en descendente : "+ lista_medicamentos);
		
		
		
	
	}
	
	// guardar fichero
	public void fichero() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("id.dat"))) {
        	List<Integer> lista_id = new ArrayList<Integer>();
    		Collection<Integer> colection= mapa_consulta.keySet();
    		java.util.Iterator<Integer> iterator = colection.iterator();
            while (iterator.hasNext()) {
            	Integer a = iterator.next();
            	lista_id.add(a);
            }
            oos.writeObject(lista_id);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Fichero creado");
    }
}

	



