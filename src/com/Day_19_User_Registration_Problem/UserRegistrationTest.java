package com.Day_19_User_Registration_Problem;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class UserRegistrationTest 
{
	@Test
	void getTheFirstNameAndCheckWhetherTheRegexCodeIsCorrectOrNot() 
	{
		UserRegistration ur = new UserRegistration();
		String firstName = "Arafath";	
		boolean check = ur.firstNameCheck(firstName);
		Assert.assertEquals(true, check);
	}
	@Test
	void getTheLastNameAndCheckWhetherTheRegexCodeIsCorrectOrNot() 
	{
		UserRegistration ur = new UserRegistration();
		String lastName = "Arafath";	
		boolean check = ur.lastNameCheck(lastName);
		Assert.assertEquals(true, check);
	}
	@Test
	void getTheEmailAndCheckWhetherTheRegexCodeIsCorrectOrNot() 
	{
		UserRegistration ur = new UserRegistration();
		String email = "abc.XYZ@bl.co.in";
		boolean check = ur.emailCheck(email);
		Assert.assertEquals(true, check);
	}
}
