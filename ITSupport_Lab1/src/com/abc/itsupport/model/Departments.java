package com.abc.itsupport.model;

import java.util.HashMap;

public class Departments {
	
	//for department names
	public static final String TECHNICAL ="Techincal";
	public static final String ADMIN ="Admin";
	public static final String HUMAN_RESOURCE ="Human Resource";
	public static final String LEGAL ="Legal";
	
	
	//for department codes to be used in generating email id since email uses different text
	public static final String TECH ="tech";
	public static final String ADM ="admin";
	public static final String HR ="hr";
	public static final String LEGL ="legal";
	
	//Initializing static final at declaration
	public static final HashMap<String, String> departmentMap = new HashMap<String, String>();
	
	public static void setDepartmentCode() {
		
	//map the names to the department codes to be used in generating email
	departmentMap.put(TECHNICAL, TECH);
	departmentMap.put(ADMIN, ADM);
	departmentMap.put(HUMAN_RESOURCE, HR);
	departmentMap.put(LEGAL, LEGL);
	
	
	}
	
	/* Returns the department code and takes the department name as key */
	public static String getDepartmentCode(String key) {
		
		return departmentMap.get(key);
		
	}
	
}
