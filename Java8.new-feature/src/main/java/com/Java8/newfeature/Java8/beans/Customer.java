package com.Java8.newfeature.Java8.beans;

import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


//@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString 
@Getter @Setter  @ToString @AllArgsConstructor @NoArgsConstructor
//@Data
//@Validated
public class Customer {	
	
	@Min(value = 2,message = "Number lesser than 2...")
	@Max(value = 2001,message = "Number out of range...")
	private Integer id;
	
	@NotBlank(message = "Cannot be null or blank...")
	@Pattern(regexp = "[a-zA-Z0-9]+$", message = "Not Alphanumeric...")
	private String name;
	
	@Email(message = "email is not valid...") 
	@NotBlank
	private String email;	
	
	@NotNull
	private List<String> phoneNumbers;
	
	
}
