package com.Day_19_User_Registration_Problem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
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
}
