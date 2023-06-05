package com.abc.itsupport.service;

import java.util.Random;
import com.abc.itsupport.interfaces.ICredentials;
import com.abc.itsupport.model.Departments;
import com.abc.itsupport.model.Employee;

public class CredentialService implements ICredentials{
	
	@Override
    public String generatePassword()
    {
		// using default password length 7
    	int length = 7;
    	
        String numbers = "0123456789";
        String specialChars = "!@#$%^&*_=+-/.?";
        String capitalChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallChars = "abcdefghijklmnopqrstuvwxyz";
        
        //pass is a String which has all capital,small,numbers and special characters.
        String pass =  capitalChars + smallChars +numbers + specialChars;
        Random random = new Random();
  
        char[] password = new char[length];
        
        for (int i = 0; i < length; i++)
        {
        	/*one integer value in given range(7) is randomly generated,character at 
        	that value from pass string is stored in character array password[] */
            password[i] = pass.charAt(random.nextInt(pass.length()));
        }
        	/*return String using constructor that takes char array. toString() method does not work
        	as it fetches from String pool and does not create new String password each time(tested) */
        	return new String(password);
    }
    
    @Override
    public String generateEmailAddress(Employee e) {
    	
    	/* Use lower-case for name,resolve department code using HashMap from 
    	 	Departments class using department name chosen by user, 
    	 		get company name static variable from Employee */
    	String email= e.getFirstName().toLowerCase()+e.getLastName().toLowerCase()+"@"+
    						Departments.getDepartmentCode(e.getDepartment())+"."+
    								Employee.getCompanyName()+".com";
    	
    	return email;
    }
    
    @Override
    public void showCredentials(Employee e){
    	
    	System.out.println("Dear "+e.getFirstName() +" , your generated credentials are as follows :");
    	System.out.println("Email-->  "+e.getEmpDetails().getEmail());
    	System.out.println("Password-->  "+e.getEmpDetails().getPassword());
    }

}
