package com.axelduarte.mapstruckdemo.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Mappings;
import org.springframework.beans.factory.annotation.Autowired;

import com.axelduarte.mapstruckdemo.dto.GetCategory;
import com.axelduarte.mapstruckdemo.entity.Category;
import com.axelduarte.mapstruckdemo.repository.CategoryRepository;



@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)

public abstract class CategoryMapper {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Mappings({
		@Mapping(source="id", target="categoryid"),
		@Mapping(source="name", target="categoryname")
	})
	
	abstract GetCategory toGetCategory(Category category);

	Category toEntity(GetCategory getCategory) {
		//este es el dtp
		if (getCategory == null)
			return null;

		// orElse(null) retorna valor predetermidado si esta nulo el optional
		Category category = categoryRepository.findById(getCategory.getCategoryid()).orElse(null);
		//esta es la entidad
		if (category == null)
			return null;
		
		category.setId(getCategory.getCategoryid());
		category.setName(getCategory.getCategoryname());
		
		return category;
	}
	// solo se implementara por Mapstruct las funciones abstractas
	// Desde Category obtenemos una lista De GetCategory
	abstract List<GetCategory> toGetCategoryList(List<Category> categoryList);

	// Obtenemos una lista de Tipo list
	abstract List<Category> toEntityList(List<GetCategory> getCategoryList);
}
