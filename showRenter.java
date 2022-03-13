	//Author: Divine Iloh
	//BINS 5312
	//Date: 03/11/2022

package showRenter;
import Renter.Renter; 

public class showRenter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create newRental as an object of the Renter class
		Renter newRental = new Renter();
		
		
		//setting the values of the methods in our Renter class
		newRental.setPersonID("92005");
		newRental.setLastName("Brown");
		newRental.setFirstName("James");
		newRental.setAge(45);
		newRental.setCreditScore(750);
		newRental.setIncome(100000);
		
		
		//display renter's records using the get methods
		System.out.println("Renter 			: " + newRental.getFirstName() + " " + newRental.getLastName());
		System.out.println("Renter ID		: " + newRental.getPersonID());
		System.out.println("Income	 		: " + newRental.getIncome());
		System.out.println("Credit Score		: " + newRental.getCreditScore());
		System.out.println("Renter's Age		: " + newRental.getAge());
		
	}

}
