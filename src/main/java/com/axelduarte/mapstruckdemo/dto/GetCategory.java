package com.axelduarte.mapstruckdemo.dto;

 
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class GetCategory {

	private long categoryid;
	
	private String categoryname;
	
	//Generamos una relacion
		
}
