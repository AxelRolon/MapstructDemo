package com.axelduarte.mapstruckdemo.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class GetProduct {

		private long productid;
		
		private String productname;
		
		private String creationDate;
		
		private GetCategory productcategory;
		
}

/*	public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCreationDate() {
	return creationDate;
}

public void setCreationDate(String creationDate) {
	this.creationDate = creationDate;
}

@Override
public String toString() {
	return "GetProduct [id=" + id + ", name=" + name + ", creationDate=" + creationDate + "]";
}
*/