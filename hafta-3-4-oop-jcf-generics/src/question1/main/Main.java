package question1.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import question1.accountManagement.Account;
import question1.accountManagement.AccountManager;
import question1.adressManagement.Adress;
import question1.adressManagement.AdressManager;
import question1.adressManagement.BusinessAdress;
import question1.adressManagement.HomeAdress;
import question1.customerManagement.EnterpriseCustomer;
import question1.customerManagement.IndividualCustomer;
import question1.customerManagement.User;
import question1.exceptionManagement.InvalidAuthenticationException;
import question1.insuranceManagement.Insurance;

public class Main {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		AccountManager accountManager = new AccountManager(null);
		createCustomer();
	
	}
		

	public static int makeProcessChoice() {

		System.out.println("İşlem tercihinizi yapınız...");
		int choice = scanner.nextInt();
		return choice;
	}

	public static void insertCustomer() {

		ArrayList<Adress> userAdress = new ArrayList<Adress>();

		System.out.println("Add Customer Info:");

		System.out.println("Name");
		String name = scanner.nextLine();

		System.out.println("Last Name");
		String lastName = scanner.nextLine();

		System.out.println("Email");
		String email = scanner.nextLine();

		System.out.println("Password");
		String password = scanner.nextLine();

		System.out.println("Job");
		String job = scanner.nextLine();

		System.out.println("Age");
		int age = scanner.nextInt();

		User user = new User(name, lastName, email, password, job, age, userAdress);

			System.out.println("Customer's Home Adress Info:");

			System.out.println("Country");
			String country = scanner.nextLine();

			System.out.println("City");
			String city = scanner.nextLine();

			System.out.println("Street");
			String street = scanner.nextLine();

			System.out.println("Number");
			int number = scanner.nextInt();

			System.out.println("PostCode");
			int postCode = scanner.nextInt();

			AdressManager.addAdress(user, new HomeAdress(country, city, street, number, postCode));
			Account account = new IndividualCustomer(user, new ArrayList<Insurance>());
			
			System.out.println("*********************************");
			System.out.println("Saved!");


			System.out.println("Customer's Business Adress Info:");

			System.out.println("Country");
			country = scanner.nextLine();

			System.out.println("City");
			city = scanner.nextLine();

			System.out.println("Street");
			String companyName = scanner.nextLine();

			System.out.println("Number");
			number = scanner.nextInt();

			System.out.println("Post Code");
			postCode = scanner.nextInt();

			AdressManager.addAdress(user, new BusinessAdress(country, city, companyName, postCode));
			account = new EnterpriseCustomer(user, new ArrayList<Insurance>());

			System.out.println("*********************************");
			System.out.println("Saved!");


	}

	public static AccountManager createCustomer() {
		
		Set<Account> accountSet = new TreeSet<Account>();
		AccountManager accountManager = new AccountManager(accountSet);
		insertCustomer();
		return accountManager;

	}

}
