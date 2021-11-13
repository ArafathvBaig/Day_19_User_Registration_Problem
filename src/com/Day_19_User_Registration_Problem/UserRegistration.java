package com.Day_19_User_Registration_Problem;

import java.util.regex.Pattern;

public class UserRegistration 
{
	public boolean firstNameCheck(String firstName)
	{
		boolean check = Pattern.matches("([A-Z][a-z]{2,})", firstName);
	    return check;
	}
	public boolean lastNameCheck(String lastName)
	{
		boolean check = Pattern.matches("([A-Z][a-z]{2,})", lastName);
	    return check;
	}
	public static void main(String[] args)
	{
		UserRegistration ur = new UserRegistration();
		String firstName = "Arafath";
		String lastName = "Baig";
		boolean check = ur.firstNameCheck(firstName);
		boolean check1 = ur.lastNameCheck(lastName);
		if(check == true)
		{
			System.out.println("First Name is Correct: "+firstName);
		}
		else
		{
			System.out.println("First Name is InCorrect");
		}
		if(check1 == true)
		{
			System.out.println("Last Name is Correct: "+lastName);
		}
		else
		{
			System.out.println("Last Name is InCorrect");
		}
	}
}









