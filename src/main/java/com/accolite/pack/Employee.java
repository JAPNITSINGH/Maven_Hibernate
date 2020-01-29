package com.accolite.pack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "hibernate_Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="Anoataion_First_Name")
	private String firstName;
	@Transient // last name will not be in the column
	private String lastName;
	private String email;
	@OneToMany(cascade=CascadeType.ALL)
	List<Address> listOfAddresses = new ArrayList<Address>();
	@ElementCollection
//	@JoinTable(name = "Annotation_")
	private Set<String> skillSet = new HashSet<String>();
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstname) {
		this.firstName = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastname) {
		this.lastName = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void addSkillSet(String s)
	{
		
	}
	public Employee()
	{}
	public Employee(String firstName, String lastName)
	{	//address = new Address("Little Fighter Street");
		Address e1 = new Address("Little Fighter Street");
		Address e2 = new Address("Little Fighter 2 Street");
		listOfAddresses.add(e1);
		listOfAddresses.add(e2);
		skillSet.add("Java");skillSet.add("MySQL");
		this.firstName = firstName;
		this.lastName = lastName;
	}

	
	public List<Address> getListOfAddresses() {
		return listOfAddresses;
	}
	public void setListOfAddresses(List<Address> listOfAddresses) {
		this.listOfAddresses = listOfAddresses;
	}
	public Set<String> getSkillSet() {
		return skillSet;
	}
	public void setSkillSet(Set<String> skillSet) {
		this.skillSet = skillSet;
	}
}

