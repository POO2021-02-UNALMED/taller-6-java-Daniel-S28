package vehiculos;
import java.util.*;

public class Fabricante {
	private String nombre;
	private Pais pais;
	public int vendidos;
	private static List<Fabricante> fabricantes = new ArrayList<Fabricante>();
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre=nombre;
		this.pais=pais;
		fabricantes.add(this);
	}
	
	public static Fabricante fabricaMayorVentas() {
		int mayor=0;
		Fabricante masvendedor=null;
		for(Fabricante f:fabricantes) {
			if(f.vendidos>mayor) {
				mayor=f.vendidos;
				masvendedor=f;
			}
		}
		return masvendedor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	
}
