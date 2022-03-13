	//Author: Divine Iloh
	//BINS 5312
	//Date: 03/11/2022

package Apartment;
import Renter.Renter;
public class Apartment {

	//data fields
	private String aptNum, roomNum, bathNum, leaseTerms;
	private double amount;
	private Renter firstRenter;
	
	//set methods or mutator methods
	
	public void setAptNum (String apartmentNo)
	{
		aptNum = apartmentNo;
	}
	
	public void setRoomNum (String bedrooms)
	{
		roomNum = bedrooms;
	}
	
	public void setBathroomNum (String bathrooms)
	{
		bathNum = bathrooms;
	}
	
	public void setLeaseTerms (String terms)
	{
		leaseTerms = terms;
	}
	
	public void setLeaseAmount (double amt)
	{
		amount = amt;
	}
	
	public void setRenter (Renter newRenter)
	{
		firstRenter = newRenter;
	}
	
	//get methods or accessor methods
	
	public String getAptNum ()
	{
		return aptNum;
	}
	
	public String getRoomNum ()
	{
		return roomNum;
	}
	
	public String getBathroomNum ()
	{
		return bathNum;
	}
	
	public String getLeaseTerms ()
	{
		return leaseTerms;
	}
	
	public double getLeaseAmount ()
	{
		return amount;
	}
	
	public Renter getRenter ()
	{
		return firstRenter;
	}
	
	
}
