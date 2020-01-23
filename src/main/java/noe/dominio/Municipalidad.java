package noe.dominio;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Municipalidad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long Id;

	@OneToMany(cascade=CascadeType.ALL)
	private List<Plaza>  plazasLindas;
	
	@Column(name = "nombre")
	private String nombre;
	
	

	
	public Municipalidad(List<Plaza> plazasLindas) {
		this.plazasLindas = plazasLindas;
	}

	public Municipalidad() {
	}


	
	
	
	public List<Plaza> getPlazasLindas() {
		return plazasLindas;
	}

	public void setPlazasLindas(List<Plaza> plazasLindas) {
		this.plazasLindas = plazasLindas;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}
