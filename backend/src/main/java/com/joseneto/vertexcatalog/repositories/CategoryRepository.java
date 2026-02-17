package com.joseneto.vertexcatalog.repositories;

import com.joseneto.vertexcatalog.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
