package fr.afpa.employees;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/*
Objectif :
L’objectif de ce TP est de concevoir un programme en console basé sur une approche objet et
permettant de gérer (vraiment très basiquement) des salariés d’une entreprise.

Vous allez écrire une classe représentant les salariés d'une entreprise.
Vous pourrez vous aider du PDF disponible sur pour obtenir des informations sur la façon de faire.
*/

public class Employee {
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
	public Employee(String registrationNumber, String lastName, String firstName, double salary, String birthDay) {
		this.registrationNumber = registrationNumber;
		this.lastName = lastName;
		this.firstName = firstName;
		this.salary = salary;
		this.birthDay = LocalDate.parse(birthDay);
	}

	// implémenter les setters et getters de la classe (permet d'accéder aux
	// attributs privés)
	// registrationNumber
	public String getRegistrationNumber() {
		return this.registrationNumber;
	}

	/**
	 * Setter sur le matricule
	 * 
	 * @param registrationNumber Le nouveau matricule (hypoyhétique, à vérifier)
	 * @throws Exception lancée si le matricule n'est pas bon
	 */
	// *** IMPORTANT ***
	public void setRegistrationNumber(String registrationNumber) throws Exception {
		// A ce niveau, tentative de modification du matricule
		// Nous devons vérifier le matricule !
		// ------> PROGRAMMING DEFENSIVE = vérification des paramètres d'entrée ->
		// registrationNumber
		if (checkRegistrationNumber(registrationNumber) == true) {
			// VRAI donc matricule correct = Modification matricule
			this.registrationNumber = registrationNumber;
		} else {
			// FAUX donc on fait qqch pour traiter ce cas
			// EXCEPTION = ERREUR
			throw new Exception("ERROR: The new registration number isn't valid !");
		}
	}

	// lastName
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) throws Exception {
		if (checkName(lastName) == true) {
			this.lastName = lastName;
		} else {
			throw new Exception("ERROR: the lastName isn't valid !");
		}
	}

	// firstName
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) throws Exception {
		if (checkName(firstName) == true) {
		this.firstName = firstName;
		}else{
			throw new Exception("ERROR: the lastName isn't valid !");
		}
	}

	// salary
	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// birthDay
	public LocalDate getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) throws Exception{
		if(checkBirthDate(birthDay) == true){
			this.birthDay = LocalDate.parse(birthDay);
		}else{
			throw new Exception("ERROR: the Birth Date isn't valid !");
		}
		
	}

	// Method - Full Name
	public String fullName() {
		return "Employee Full Name {"
				+ getLastName()
				+ " " + getFirstName()
				+ "}";
	}

	public double toNetSalary() {
		return this.salary - this.salary * (this.socialParticipation / 100.0);
	}

	public long daysBeforeBirthDay() {
		LocalDate currentDate = LocalDate.now();
		LocalDate nextBirthDay = this.birthDay.withYear(currentDate.getYear()); // .withYear permet de set l'année
																				// birthyear sr l'année actuelle ->
																				// prochain anniversaire

		// Si l'anniversaire de cette année est déjà passsée, on prend l'année prochaine
		if (nextBirthDay.isBefore(currentDate) || nextBirthDay.isEqual(currentDate)) {
			nextBirthDay = nextBirthDay.plusYears(1); // .plusYears rajoute une valeur à l'année, idem .plusMonths ou
														// .plusDays
		}

		return ChronoUnit.DAYS.between(currentDate, nextBirthDay);
	}

	/**
	 * Vérifie une chaîne de caractères et indique s'il s'agit d'un matricuel
	 * correctement formaté ou non
	 * 
	 * @param inputToCheck La chaîne de caractère à vérifier
	 * @return VRAI s'il s'agit d'un matricule, FAUX sinon
	 */
	private boolean checkRegistrationNumber(String inputToCheck) {

		// Vérification de la taille de la chaîne de caractères
		if (inputToCheck.length() != 7) {
			return false;
		}

		// déclaration du booléen qui va stocker le résultat de la vérification
		// VRAI -> la chaîne de caractères passée en paramètre est un matricule
		// correctement formaté
		// FAUX -> la chaîne de caractères passée en paramètre est un matricule pas bien
		// formaté
		boolean isRegistrationNumber = false;

		// Cette première boucle permet de passer en revue TOUS les caractères de la
		// chaîne
		for (int index = 0; index < inputToCheck.length(); index++) {
			// index = longueur de intupToCheck - 1 = 6
			char ch = inputToCheck.charAt(index);
			if (index == 0 || index == 1 || index == 5 || index == 6) {

				// vérification du caractère, s'agit-il d'un chiffre ?
				if (Character.isDigit(ch) == true) {
					isRegistrationNumber = true;
				} else { // attention, ce n'est pas un chiffre
					return false;
				}

			} else { // cas de la position 2, 3 ou 4 -> vérification de letter

				// Quelle opération dois-je faire ?
				if (Character.isLetter(ch)) {
					isRegistrationNumber = true;
				} else {
					return false;
				}
			}
		} // fin du FOR, BRAVO !

		return isRegistrationNumber;
	}

	/**
	 * Vérifie qu'une chaine de caractères passée en paramètre est un prénom ou un nom
	 * Pas de chiffres + caractères spé sauf '-'
	 * 
	 * @param inputToCheck La chaîne de caractères à vérifier
	 * @return VRAI s'il s'agit d'un prénom/nom correctement formaté, FAUX sinon
	 */

	private boolean checkName(String inputToCheck) {
		// déclaration du booléen qui va stocker le résultat de la vérification
		// VRAI -> la chaîne de caractères passée en paramètre est un matricule
		// correctement formaté
		// FAUX -> la chaîne de caractères passée en paramètre est un matricule pas bien
		// formaté

		boolean isName = false;
		for (int index = 0; index < inputToCheck.length(); index++) {
			char ch = inputToCheck.charAt(index);
			if (Character.isLetter(ch) == true || ch == '-') { // rappel || -> ou
				isName = true;
			} else {
				return false;
			}
		}
		return isName;
	}

	/**
	 * Vérifie qu'une chaine de caractères passée en paramètre est une date de naissance
	 *
	 * @param inputToCheck La chaîne de caractères à vérifier
	 * @return VRAI s'il s'agit d'une date de naissance correctement formaté, FAUX sinon
	 */

	private boolean checkBirthDate(String inputToCheck) {

		if (inputToCheck.length() != 10) {
			return false;
		}

		boolean isBirthDate = false;
		for (int index = 0; index < inputToCheck.length(); index++) {
			// index = longueur de intupToCheck - 1 = 9
			char ch = inputToCheck.charAt(index);
			if (index == 0 || index == 1 || index == 2 || index == 3 || index == 5|| index == 6|| index == 8|| index == 9) {

				// vérification du caractère, s'agit-il d'un chiffre ?
				if (Character.isDigit(ch) == true) {
					isBirthDate = true;
				} else { // attention, ce n'est pas un chiffre
					return false;
				}

			} else { // cas de la position 4 et 7 -> vérification -

				if (ch == '-') {
					isBirthDate = true;
				} else {
					return false;
				}
			}
		}
		return isBirthDate;
	}


	// implémenter la méthode "toString()" qui renvoie une chaîne de caractère qui
	// représente un objet de la classe employé
	// plus d'information sur la méthode "toString()" ->
	// https://codegym.cc/fr/groups/posts/fr.986.mthode-java-tostring

	@Override
	public String toString() {
		return "Employee {"
				+ "Registration Number: " + getRegistrationNumber()
				+ ", Last Name: " + getLastName()
				+ ", First Name: " + getFirstName()
				+ ", Social Participation: " + socialParticipation
				+ ", Salary: " + getSalary()
				+ ", Net Salary: " + toNetSalary()
				+ ", Birth Day: " + getBirthDay()
				+ ", Next Birth Day in: " + daysBeforeBirthDay() + " days. "
				+ "}";
	}
}
