package com.axelduarte.mapstruckdemo.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Mappings;

import com.axelduarte.mapstruckdemo.dto.GetProduct;
import com.axelduarte.mapstruckdemo.entity.Product;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, uses= {CategoryMapper.class})
public interface ProductMapper {

	@Mappings( {
	
		
		@Mapping(source="creationDate", target="creationDate",dateFormat ="dd-MMM-yyyy"),
		@Mapping(source="name", target ="productname"),
		@Mapping(source="id", target ="productid"),
		@Mapping(source="category", target ="productcategory")
	})
	
	//Product map(GetProduct value);
	
	GetProduct toGetDTO(Product products);

	 //mapeo a la inversa 
	@InheritInverseConfiguration
	//Product productToEntity(List<GetProduct> getProductList);
	
	List<GetProduct> toGetProductList (List<Product> productsList);

	List<Product> toGetEntityList(List<GetProduct> listProduct);

}
