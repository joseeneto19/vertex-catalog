package com.joseneto.vertexcatalog.servicies;

import com.joseneto.vertexcatalog.entities.Category;
import com.joseneto.vertexcatalog.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

}
