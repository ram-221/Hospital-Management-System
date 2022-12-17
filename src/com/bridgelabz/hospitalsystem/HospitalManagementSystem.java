package com.bridgelabz.hospitalsystem;

/*Write a java program for hospital management to create a patient details 
and print in arraylist.write two classes 1.patient details
2.hotel in which add details method is there with
 main method  
( firstName,lastName,  address, city,  state, zip,  email, phoneNumber)*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// Create Class
public class HospitalManagementSystem {

	//Using ArrayList Implementation to PatientDetails 
		List<PatientDetails> arrayPatientdetails = new ArrayList<PatientDetails>();
		
		//Create a Object to PatientDetails Class
		 PatientDetails patient = new PatientDetails();
		
		 //Create a Method Added to Patient Details 
		public void addPatientDetails() {
			
			//Using Scanner class
			Scanner scan = new Scanner(System.in);
			System.err.println("Enter the first name");
			patient.setFirstName(scan.nextLine());
			System.out.println("Enter the lastName");
			patient.setLastName(scan.nextLine());
			System.out.println("Enter the Address");
			patient.setAddress(scan.next());
			System.out.println("Enter the City");
			patient.setCity(scan.next());
			System.out.println("Enter the State");
			patient.setState(scan.next());
			System.out.println("Enter the Zip");
			patient.setZip(scan.nextInt());
			System.out.println("Enter the Email");
			patient.setEmail(scan.next());
			System.out.println("Enter the Phonenumber");
			patient.setPhoneNumber(scan.nextLong());
			arrayPatientdetails.add(patient);
			scan.close();
		}
		
		//Create a Display Method
		public void display() {
			System.out.println(arrayPatientdetails);
		}
		
		//Main method 
		public static void main(String[] args) {
			
			System.out.println("Wel Come To Hospital Management System");
			
			//Create a Object of Hospital Management class
			HospitalManagementSystem hospitalManagement = new HospitalManagementSystem();
			hospitalManagement.addPatientDetails();
			hospitalManagement.display();
		}
}
