package fr.afpa.employees;

import java.util.ArrayList;

/**
 * Classe principale du projet, contient la fonction "main"
 */
class EmployeeMain {
	public static void main(String[] args) {
		System.out.println("\n----- Exercice de programmation objet - classe \"Employee\" -----");

		// instanciez 4 objets de la classe "Employee" (une fois celle-ci implémentée)
		Employee employee1 = new Employee("11ABC22", "Don", "Michel", 2000.0, "1995-05-22");
		Employee employee2 = new Employee("11ABC23", "Joly", "Angelina", 10000.0, "1975-06-04");
		Employee employee3 = new Employee("11ABC24", "Pitt", "Brad", 10000.0, "1963-12-18");
		Employee employee4 = new Employee("11ABC25", "Bonette", "John", 5000.0, "1995-07-19");

		// ex test, modifier registrationNumber avec un setter
		// pour gérer une exception -> utiliser TRY... CATCH
		try {
			employee1.setRegistrationNumber("11ABC21");
		
		} catch (Exception exceptionToProcess) {
			// CODE POUR GERER L'EXCEPTION
			// dans notre cas juste un message d'erreur
			System.out.println(exceptionToProcess.getMessage()); // appelle le message de l'exception ***
		}

		// modifier NOM avec un setter
		try {
			employee1.setLastName("Boivin");

		} catch (Exception exceptionToProcess) {
			// CODE POUR GERER L'EXCEPTION - ici idem message d'erreur
			System.out.println(exceptionToProcess.getMessage()); // appelle le message de l'exception + affichage ***
		}

		// modifier PRENOM avec un setter
		try {
			employee1.setFirstName("Chloé");

		} catch (Exception exceptionToProcess) {
			// CODE POUR GERER L'EXCEPTION - ici idem message d'erreur
			System.out.println(exceptionToProcess.getMessage()); // appelle le message de l'exception + affichage***
		}

		// modifier DATE
		try {
			employee1.setBirthDay("1995-07-19");

		} catch (Exception exceptionToProcess) {
			// CODE POUR GERER L'EXCEPTION - ici idem message d'erreur
			System.out.println(exceptionToProcess.getMessage()); // appelle le message de l'exception + affichage***
		}


		// afficher les informations des employés avec System.out.println

		System.out.println("Employee n°1:");
		System.out.println("Registration Number : " + employee1.getRegistrationNumber());
		System.out.println("Last Name : " + employee1.getLastName());
		System.out.println("First Name : " + employee1.getFirstName());
		System.out.println("Salary : " + employee1.getSalary());
		System.out.println("Net Salary : " + employee1.toNetSalary());
		System.out.println("Birth Day : " + employee1.getBirthDay());
		System.out.println("Days before next Birth Day : " + employee1.daysBeforeBirthDay());

		System.out.println("-----------------------------------------------------");

		System.out.println("Employee n°2:");
		System.out.println("Registration Number : " + employee2.getRegistrationNumber());
		System.out.println("Last Name : " + employee2.getLastName());
		System.out.println("First Name : " + employee2.getFirstName());
		System.out.println("Salary : " + employee2.getSalary());
		System.out.println("Net Salary : " + employee2.toNetSalary());
		System.out.println("Birth Day : " + employee2.getBirthDay());
		System.out.println("Days before next Birth Day : " + employee2.daysBeforeBirthDay());

		System.out.println("-----------------------------------------------------");

		System.out.println("Employee n°3:");
		System.out.println("Registration Number : " + employee3.getRegistrationNumber());
		System.out.println("Last Name : " + employee3.getLastName());
		System.out.println("First Name : " + employee3.getFirstName());
		System.out.println("Salary : " + employee3.getSalary());
		System.out.println("Net Salary : " + employee3.toNetSalary());
		System.out.println("Birth Day : " + employee3.getBirthDay());
		System.out.println("Days before next Birth Day : " + employee3.daysBeforeBirthDay());

		System.out.println("-----------------------------------------------------");

		System.out.println("Employee n°4:");
		System.out.println("Registration Number : " + employee4.getRegistrationNumber());
		System.out.println("Last Name : " + employee4.getLastName());
		System.out.println("First Name : " + employee4.getFirstName());
		System.out.println("Salary : " + employee4.getSalary());
		System.out.println("Net Salary : " + employee4.toNetSalary());
		System.out.println("Birth Day : " + employee4.getBirthDay());
		System.out.println("Days before next Birth Day : " + employee4.daysBeforeBirthDay());

		System.out.println("-----------------------------------------------------");

		System.out.println(employee1.toString());
		System.out.println(employee2.toString());
		System.out.println(employee3.toString());
		System.out.println(employee4.toString());

		System.out.println("-----------------------------------------------------");

		System.out.println(employee1.fullName());
		System.out.println(employee2.fullName());
		System.out.println(employee3.fullName());
		System.out.println(employee4.fullName());

		System.out.println("-----------------------------------------------------");

		ArrayList<Employee> listEmployees = new ArrayList<>();
		listEmployees.add(employee1);
		listEmployees.add(employee2);
		listEmployees.add(employee3);
		listEmployees.add(employee4);

		for (Employee employee : listEmployees) {
			System.out.println(employee);
		}
	}
}

//TEST Modif Https -> SSH