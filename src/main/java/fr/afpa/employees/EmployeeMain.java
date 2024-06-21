package fr.afpa.employees;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Classe principale du projet, contient la fonction "main"
 */
class EmployeeMain
{
	public static void main(String[] args) 
	{
		System.out.println("\n----- Exercice de programmation objet - classe \"Employee\" -----");

		//instanciez 4 objets de la classe "Employee" (une fois celle-ci implémentée)
		Employee employee1 = new Employee("11ABC22", "Don", "Michel", 2000.0);
		Employee employee2 = new Employee("11ABC23", "Joly", "Angelina", 10000.0);
		Employee employee3 = new Employee("11ABC24", "Pitt", "Brad", 10000.0);
		Employee employee4 = new Employee("11ABC25", "Bonette", "John", 5000.0);

		//afficher les informations des employés avec System.out.println

		System.out.println("Employee n°1:");
		System.out.println("Registration Number : " + employee1.getRegistrationNumber());
		System.out.println("Last Name : " + employee1.getLastName());
		System.out.println("First Name : " + employee1.getFirstName());
		System.out.println("Salary : " + employee1.getSalary());

		System.out.println("-----------------------------------------------------");

		System.out.println("Employee n°2:");
		System.out.println("Registration Number : " + employee2.getRegistrationNumber());
		System.out.println("Last Name : " + employee2.getLastName());
		System.out.println("First Name : " + employee2.getFirstName());
		System.out.println("Salary : " + employee2.getSalary());

		System.out.println("-----------------------------------------------------");

		System.out.println("Employee n°3:");
		System.out.println("Registration Number : " + employee3.getRegistrationNumber());
		System.out.println("Last Name : " + employee3.getLastName());
		System.out.println("First Name : " + employee3.getFirstName());
		System.out.println("Salary : " + employee3.getSalary());

		System.out.println("-----------------------------------------------------");

		System.out.println("Employee n°4:");
		System.out.println("Registration Number : " + employee4.getRegistrationNumber());
		System.out.println("Last Name : " + employee4.getLastName());
		System.out.println("First Name : " + employee4.getFirstName());
		System.out.println("Salary : " + employee4.getSalary());

		System.out.println("-----------------------------------------------------");

		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
		System.out.println(employee4);

		System.out.println("-----------------------------------------------------");

		System.out.println(employee1.fullName());
		System.out.println(employee2.fullName());
		System.out.println(employee3.fullName());
		System.out.println(employee4.fullName());

		System.out.println("-----------------------------------------------------");

	}
}

