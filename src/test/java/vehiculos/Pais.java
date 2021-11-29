package vehiculos;
import java.util.*;

public class Pais {
	private String nombre;
	public int vendidos;
	private static List<Pais> listapaises = new ArrayList<Pais>();
	
	public Pais(String nombre) {
		this.nombre=nombre;
		listapaises.add(this);
	}
	
	public static Pais paisMasVendedor() {
		int mayor=0;
		Pais masvendedor=null;
		for (Pais p:listapaises) {
			if (p.vendidos>mayor) {
				mayor=p.vendidos;
				masvendedor=p;
			}
		}
		return masvendedor;
	}
	
	public int getVendidos() {
		return vendidos;
	}

	public void setVendidos(int vendidos) {
		this.vendidos = vendidos;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
}
