package com.Day_19_User_Registration_Problem;

import java.util.regex.Pattern;

public class UserRegistration 
{
	public boolean firstNameCheck(String firstName)
	{
		boolean check = Pattern.matches("([A-Z][a-z]{2,})", firstName);
	    return check;
	}
	public static void main(String[] args)
	{
		String firstName = "Arafath";
		UserRegistration ur = new UserRegistration();
		boolean check = ur.firstNameCheck(firstName);
		if(check == true)
		{
			System.out.println("First Name is Correct: "+firstName);
		}
		else
		{
			System.out.println("First Name is InCorrect");
		}
	}
}









