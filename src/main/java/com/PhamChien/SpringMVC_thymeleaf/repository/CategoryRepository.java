package com.PhamChien.SpringMVC_thymeleaf.repository;


import com.PhamChien.SpringMVC_thymeleaf.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    List<Category> findByNameContaining(String name);
    Optional<Category> findByName(String name);
    Page<Category> findByNameContaining(String name, Pageable pageable);
}
