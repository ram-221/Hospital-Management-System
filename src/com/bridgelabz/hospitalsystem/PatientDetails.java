package com.bridgelabz.hospitalsystem;

public class PatientDetails {

	//define instance Variable
		private String firstName,lastName,address,city,state,email;
		private int zip ;
		private Long phoneNumber;
		
		//Create Parameterized Constructor
		public PatientDetails(String firstName, String lastName,String address,
				String city,String state,int zip,String email,Long phoneNumber) {
			this.firstName =firstName;
			this.lastName = lastName;
			this.address = address;
			this.city = city;
			this.state = state;
			this.zip = zip;
			this.email = email;
			this.phoneNumber = phoneNumber;
		}
		
		// Create default constructor
		public PatientDetails() {
			
		}

		public String getFirstName() {
			return address;
		}
		
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
		
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
		public String getAddress() {
			return address;
		}
		
		public void setAddress(String address) {
			this.address = address;
		}
		
		public String getCity() {
			return city;
		}
		
		public void setCity(String city) {
			this.city = city;
		}
		
		public String getState() {
			return state;
		}
		
		public void setState(String state) {
			this.state = state;
		}
		
		public int getZip() {
			return zip;
		}
		
		public void setZip(int zip) {
			this.zip = zip;
		}
		
		public String getEmail() {
			return email;
		}
		
		public void setEmail(String email) {
			this.email = email;
		}
		
		public Long getPhoneNumber() {
			return phoneNumber;
		}
		
		public void setPhoneNumber(Long phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		
		@Override
		public String toString() {
			return "Patient Details --> firstName ="+firstName+" lastName ="+lastName+" Addres ="+address+
					"City ="+city+" State ="+state+" Zip ="+zip+" Email ="+" PhoneNumber ="+phoneNumber;
			
		}
}
