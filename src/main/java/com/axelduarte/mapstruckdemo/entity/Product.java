package com.axelduarte.mapstruckdemo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name= "product")
public class Product {

	@Id
	@Column(name= "id")
	private Long id;
	
	@Column(name= "name")
	private String name;
	
	@Column(name= "creation_date")
	private LocalDateTime creationDate;

	//Creamos una relacion 
	
	@ManyToOne
	@JoinColumn(name ="category_id")
	private Category category;

/*public Long getId() {
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

public LocalDateTime getCreationDate() {
return creationDate;
}

public void setCreationDate(LocalDateTime creationDate) {
this.creationDate = creationDate;
}

@Override
public String toString() {
return "Product [id=" + id + ", name=" + name + ", creationDate=" + creationDate + "]";
}*/
}

