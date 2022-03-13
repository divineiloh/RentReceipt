	//Author: Divine Iloh
	//BINS 5312
	//Date: 03/11/2022

package showApartmentRenter;
import Apartment.Apartment;
import Renter.Renter;
public class showApartmentRenter {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//create newRental as an object of the Renter and Apt class
	Apartment showApartment = new Apartment();
	Renter AptRenter = new Renter();
	
	//setting the values of the methods in our Renter class
	AptRenter.setPersonID("72205");
	AptRenter.setLastName("Moore");
	AptRenter.setFirstName("Roger");
	AptRenter.setAge(30);
	AptRenter.setCreditScore(725);
	AptRenter.setIncome(60000);
	
	//setting the values of the methods in our Renter class
	showApartment.setAptNum("Unit 007");
	showApartment.setRoomNum("2");
	showApartment.setBathroomNum("2.5");
	showApartment.setLeaseAmount(1200);
	showApartment.setLeaseTerms("12 months");
	showApartment.setRenter(AptRenter);
	
	
	//display renter's records using the get methods
	System.out.println("Apartment 	: " + showApartment.getAptNum());
	System.out.println("Terms		: " + showApartment.getLeaseTerms());
	System.out.println("Rent	 	: $" + showApartment.getLeaseAmount());
	System.out.println("Bedrooms	: " + showApartment.getRoomNum());
	System.out.println("Bathrooms	: " + showApartment.getBathroomNum());
	
	System.out.println("******************************************************");
	System.out.println("Apartment is rented to");
	System.out.println("******************************************************");
	
	//display renter's records using the get methods
	System.out.println("Renter			: " + AptRenter.getFirstName() + " " + AptRenter.getLastName());
	System.out.println("Income			: $" + AptRenter.getIncome());
	System.out.println("Credit Score		: " + AptRenter.getCreditScore());
	
	}
	
}