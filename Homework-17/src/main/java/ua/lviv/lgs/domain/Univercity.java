package ua.lviv.lgs.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Univercity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private int accreditationLevel;
	
	@Column
	private int instituteQuantity;
	
	@Column
	private int studentsQuantity;
	
	@Column
	private String address;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccreditationLevel() {
		return accreditationLevel;
	}

	public void setAccreditationLevel(int accreditationLevel) {
		this.accreditationLevel = accreditationLevel;
	}

	public int getInstituteQuantity() {
		return instituteQuantity;
	}

	public void setInstituteQuantity(int instituteQuantity) {
		this.instituteQuantity = instituteQuantity;
	}

	public int getStudentsQuantity() {
		return studentsQuantity;
	}

	public void setStudentsQuantity(int studentsQuantity) {
		this.studentsQuantity = studentsQuantity;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Univercity [id=" + id + ", name=" + name + ", accreditationLevel=" + accreditationLevel
				+ ", instituteQuantity=" + instituteQuantity + ", studentsQuantity=" + studentsQuantity + ", address="
				+ address + "]";
	}
	
	
	


}
