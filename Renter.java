	//Author: Divine Iloh
	//BINS 5312
	//Date: 03/11/2022

package Renter;
public class Renter {

	//data fields
	private String personID, lastName, firstName;
	private double income, creditScore;
	private int age;
	
	//set methods or mutator methods
	
	public void setPersonID (String ID)
	{
		personID = ID;
	}
	
	public void setLastName (String lName)
	{
		lastName = lName;
	}
	
	public void setFirstName (String fName)
	{
		firstName = fName;
	}
	
	public void setIncome (double salary)
	{
		income = salary;
	}
	
	public void setCreditScore (double cScore)
	{
		creditScore = cScore;
	}
	
	public void setAge (int years)
	{
		age = years;
	}
	
	//get methods or accessor methods
	
	public String getPersonID ()
	{
		return personID;
	}
	
	public String getLastName ()
	{
		return lastName;
	}
	
	public String getFirstName ()
	{
		return firstName;
	}
	
	public double getIncome ()
	{
		return income;
	}
	
	public double getCreditScore ()
	{
		return creditScore;
	}
	
	public int getAge ()
	{
		return age;
	}
	
	
	//Constructor for the Renter class
	public Renter ()
	{
		personID = "9999";
		lastName = "Doe";
		firstName = "John";	
	}
	
	
	
	
}
