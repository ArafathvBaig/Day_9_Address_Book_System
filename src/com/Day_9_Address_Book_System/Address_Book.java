package com.Day_9_Address_Book_System;

import java.util.*;

public class Address_Book 
{
	String firstName;
	String lastName;
	String email;
	String address;
	String city;
	int zip;
	long phoneNo;
	
	private static ArrayList<Contacts>list = new ArrayList<>();
	
	/*
	 * This Method will Get The Details From the USER and
	 * ADD those details to the Array List Name Contacts through the object
	 */
	
	public void ContactsDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("First Name:: ");
		this.firstName = sc.nextLine();
		System.out.println("Last Name:: ");
		this.lastName = sc.nextLine();
		System.out.println("Email:: ");
		this.email = sc.nextLine();	
		System.out.println("Address:: ");
		this.address = sc.nextLine();
		System.out.println("City Name:: ");
		this.city = sc.nextLine();
		System.out.println("Zip Code:: ");
		this.zip = sc.nextInt();
		System.out.println("Phone Number:: ");
		this.phoneNo = sc.nextLong();
		Contacts person = new Contacts(firstName, lastName, email, address, city, zip, phoneNo);
        list.add(person);
        person.display();
	}
	public static void main(String[] args) 
	{
		Address_Book  Contacts_1 = new Address_Book ();
		Scanner sc = new Scanner(System.in);
		System.out.println("0. Exit");
		System.out.println("1. Add Contacts");
		System.out.println("2. Show All Contacts");
		System.out.println("Enter Your Choice");
		int choice = sc.nextInt();
		while(choice>=1)
		{
			switch(choice)
			{
				case 1:
					Contacts_1.ContactsDetails();
					break;
					
				case 2:
					for(Contacts c: list)
					{
						System.out.println(" ");
						System.out.println("First Name:: "+c.getFirstName());
						System.out.println("Last Name:: "+c.getLastName());
						System.out.println("Email:: "+c.getEmailId());
						System.out.println("Address:: "+c.getAddress());
						System.out.println("City Name:: "+c.getCity());
						System.out.println("Zip Code:: "+c.getZip());
						System.out.println("Phone Number:: "+c.getPhoneNo());
					}
					break;
		
				default:
					System.out.println("Wrong InPut");
					break;
			}
			System.out.println(" ");
			System.out.println("0. Exit");
			System.out.println("1. Add Contacts");
			System.out.println("2. Show All Contacts");
			System.out.println("Enter Your Choice");
			choice = sc.nextInt();
		}
		System.out.println("The Program Got Exit.");
	}
}

class Contacts
{
    private String firstName = " ";
    private String lastName = " ";
    private String email = " ";
    private String address = " ";
    private String city = " ";
    private int zip = 0;
    private long phoneNo = 0;

    Contacts(String firstName, String lastName, String email, String address, String city, int zip, long phoneNo) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.city = city;
        this.zip = zip;
        this.phoneNo = phoneNo;
    }
    
    /*
     * These Get Methods get the data from Address Book Class to Contacts.
     * These Set Methods set the data from Address Book variables to the Contacts variable.
     */
    
    public String getFirstName() 
    {
        return firstName;
    }
    public void setFirstName(String firstName) 
    {
        this.firstName=firstName;
    }
    public String getLastName() 
    {
        return lastName;
    }
    public void setLastName(String lastName) 
    {
        this.lastName=lastName;
    }
    public String getEmailId() 
    {
        return email;
    }
    public void setEmailId(String email) 
    {
        this.email=email;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String address)
    {
        this.address=address;
    }
    public String getCity() 
    {
        return city;
    }
    public void setCity(String city) 
    {
        this.city=city;
    }
    public int getZip()
    {
        return zip;
    }
    public void setZip(int zip)
    {
        this.zip=zip;
    }
    public long getPhoneNo() 
    {
        return phoneNo;
    }
    public void setPhoneNo(long phoneNo) 
    {
        this.phoneNo=phoneNo;
    }
    
    /*
     *This Display Method Displays Details Just Got Added To The Array List. 
     */
    
    public void display()
	{
    	System.out.println(" ");
		System.out.println("First Name:: "+firstName);
		System.out.println("Last Name:: "+lastName);
		System.out.println("Email:: "+email);
		System.out.println("Address:: "+address);
		System.out.println("City Name:: "+city);
		System.out.println("Zip Code:: "+zip);
		System.out.println("Phone Number:: "+phoneNo);
	}
}
