package com.PhamChien.SpringMVC_thymeleaf.service;



import com.PhamChien.SpringMVC_thymeleaf.entity.Category;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    <S extends Category> S save(S entity);

    List<Category> findAll();

    Page<Category> findAll(Pageable pageable);

    List<Category> findAll(Sort sort);

    List<Category> findAllById(Iterable<Long> ids);

    Optional<Category> findById(Long id);

    <S extends Category> Optional<S> findOne(Example<S> example);

    long count();

    void deleteById(Long id);

    void delete(Category entity);

    void deleteAll();

    List<Category> findByNameContaining(String name);

    Page<Category> findByNameContaining(String name, Pageable pageable);
}
