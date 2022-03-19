package com.shiv.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString*/
@Data
@AllArgsConstructor
public class Employee {
	
	private String fisrtName;
	
	private String lastName;
	
	private String email;
	
	private String role;

}
