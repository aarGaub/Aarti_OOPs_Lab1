package com.abc.itsupport.interfaces;

import com.abc.itsupport.model.Employee;

public interface ICredentials {
	
	public String generatePassword();
	
	public String generateEmailAddress(Employee e);
	
	public void showCredentials(Employee e);
	

}
