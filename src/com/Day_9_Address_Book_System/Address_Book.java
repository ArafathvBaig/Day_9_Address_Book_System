package com.Day_9_Address_Book_System;

import java.util.*;

public class Address_Book 
{
	String firstName;
	String lastName;
	String address;
	String city;
	String email;
	int zip;
	long phoneNo;
	
	Address_Book()
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
	}
	public void display()
	{
		System.out.println("First Name:: "+firstName);
		System.out.println("Last Name:: "+lastName);
		System.out.println("Email:: "+email);
		System.out.println("Address:: "+address);
		System.out.println("City Name:: "+city);
		System.out.println("Zip Code:: "+zip);
		System.out.println("Phone Number:: "+phoneNo);
	}
	public static void main(String[] args) 
	{
		Address_Book contact_1 = new Address_Book();
		contact_1.display();
	}
}
