package com.cms.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "USER")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int id;

	@NotEmpty
	@Size(min = 5, max = 20, message = "First Name must be between 5 and 30 characters long")
	@Pattern(regexp = "^[a-zA-Z]*$", message = "First Name must not contain numbers or special characters")
	private String name;
	
	
	@NotEmpty
	@Column(name = "MOBILE")
	@Size(min = 10, max = 10, message = "Not a valid mobile number")
	@Pattern(regexp = "(0|91)?[6-9][0-9]{9}", message = "Mobile Number must contain only Numbers")
	private String mobileNumber;
	
	@Column(name = "EAMIL")
	@Pattern(regexp = "[a-zA-Z0-9][a-zA-Z0-9.]+@gmail[.]com", message = "Format should be xyz@gmail.com")
	private String email;
	
	
	@NotEmpty
	@Size(min = 5, message = "user name should have at least 5 characters")
	private String userName;
	
	@NotEmpty
	@Size(min = 8, message = "password should have at least 8 characters")
	private String password;
	
}
