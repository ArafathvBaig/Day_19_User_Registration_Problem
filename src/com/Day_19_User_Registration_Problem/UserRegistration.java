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
	public boolean emailCheck(String email)
	{
		boolean check = Pattern.matches("(([a-z A-Z]{3,})([.])?([a-z A-Z]{3,})?+@(bl)([.])(co)([.])?([a-z]{2})?)", email);
		return check;
	}
	public boolean phoneNumberCheck(String phone)
	{
		boolean check = Pattern.matches("(([0-9]{2}) ([0-9]{10}))", phone);
		return check;
	}	
	public static void main(String[] args)
	{
		UserRegistration ur = new UserRegistration();
		String phone = "91 9115513683";
		boolean check = ur.phoneNumberCheck(phone);
		if(check == true)
		{
			System.out.println("Phone Number is Correct: "+phone);
		}
		else
		{
			System.out.println("Phone Number is InCorrect");
		}
	}
}









