package fr.afpa.employees;

import java.time.LocalDate;

/*
Objectif :
L’objectif de ce TP est de concevoir un programme en console basé sur une approche objet et
permettant de gérer (vraiment très basiquement) des salariés d’une entreprise.

Vous allez écrire une classe représentant les salariés d'une entreprise.
Vous pourrez vous aider du PDF disponible sur pour obtenir des informations sur la façon de faire.
*/

class Employee {
	/**
	 * Matricule de l'employé
	 */
	private String registrationNumber;

	// compléter les attributs comme présenté dans le PDF
	private String lastName;
	private String firstName;
	private double salary;
	private final int socialParticipation = 30; // ne va pas bouger, non modifiable
	private LocalDate birthDay;

	// compléter le constructeur de la classe
	public Employee(String registrationNumber, String lastName, String firstName, double salary) {
		this.registrationNumber = registrationNumber;
		this.lastName = lastName;
		this.firstName = firstName;
		this.salary = salary;
		this.birthDay = LocalDate.parse(birthDay);

	}

	// implémenter les setters et getters de la classe (permet d'accéder aux
	// attributs privés)
	//registrationNumber
	public String getRegistrationNumber() {
		return this.registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	//lastName
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	//firstName
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	//salary
	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	//birthDay
	public LocalDate getBirthDay(){
		return birthDay;
	}

	public void setBirthDay(String birthDay){
		this.birthDay = LocalDate.parse(birthDay);
	}

	//Method - Full Name

	public String fullName(){
		return "Employee Full Name {"
				+ getLastName() 
				+ " " + getFirstName()
				+"}";
	}

	//Method - Calcul

	// implémenter la méthode "toString()" qui renvoie une chaîne de caractère qui
	// représente un objet de la classe employé
	// plus d'information sur la méthode "toString()" ->
	// https://codegym.cc/fr/groups/posts/fr.986.mthode-java-tostring

	@Override
	public String toString(){
		return "Employee {"
				+ "Registration Number: " + getRegistrationNumber()
				+ ", Last Name: " + getLastName()
				+ ", First Name: " + getFirstName()
				+ ", Salary: " + getSalary()
				+ "}";
			}

}
