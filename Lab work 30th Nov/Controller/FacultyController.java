package com.jdbcconnectivity.learningmanagementsystem.controller;
import com.jdbcconnectivity.learningmanagementsystem.service.*;
import com.jdbcconnectivity.learningmanagementsystem.service.impl.*;
import com.jdbcconnectivity.learningmanagementsystem.model.Faculty;

import java.util.*;

public class FacultyController {

private FacultyService facultyService;
	
	//constructor
	public FacultyController()
	{
		//to initailize service
		facultyService = new FacultyServiceImpl();
	}
	//user interface for registration of new course
	public void registerFacultyUI()
	{
		Scanner sc = new Scanner(System.in);
		//input of course id
		System.out.print("Enter Faculty id : ");
		String facultyId = sc.nextLine();
		System.out.print("Enter Faculty Name : ");
		String name = sc.nextLine();
		System.out.print("Enter Qualification : ");
		String qualification = sc.nextLine();
		System.out.print("Enter Status : ");
		String status = sc.nextLine();
	
		
		//calling register method
		facultyService.registerFaculty(new Faculty(facultyId, name, qualification,status));
		
	}

}
