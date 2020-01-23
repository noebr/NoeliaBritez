package noe.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plaza {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long Id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "años")
	private Integer años;
	
	
	
	
	
	
	public Plaza() {
		
	}


	public Plaza(String nombre, String direccion, Integer años) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.años = años;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public Integer getAños() {
		return años;
	}


	public void setAños(Integer años) {
		this.años = años;
	}
	
	
	
	
	
	

	
	
	
	
	

}
