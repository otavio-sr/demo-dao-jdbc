package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	
	public Department() {
	}
	
	public Department(Integer id, String name) {
		//super();
		this.id = id;
		this.name = name;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	// gerando hashcodeequalls, para que o objeto seja comparado
	// pelo conteúdo e não pela referencia do ponteiro
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(id, other.id);
	}
	
	// tostring para facilitar na hora de imprimir o obj na hora que estiver testando
	@Override
	public String toString() {
		return "Departamento: id= " + id + " name= " + name;
	}
	
	
}
