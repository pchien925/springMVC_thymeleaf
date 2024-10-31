package com.PhamChien.SpringMVC_thymeleaf.service.impl;


import com.PhamChien.SpringMVC_thymeleaf.entity.Category;
import com.PhamChien.SpringMVC_thymeleaf.repository.CategoryRepository;
import com.PhamChien.SpringMVC_thymeleaf.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    @Override
    public <S extends Category> S save(S entity) {
        if(entity.getId()==null) {
            return categoryRepository.save(entity);
        }else {
            Optional<Category> opt = findById(entity.getId());
            if(opt.isPresent()) {
                if(StringUtils.isEmpty(entity.getName())) {
                    entity.setName(opt.get().getName());
                }else {
                    //lay lai image cu
                    entity.setName(entity.getName());
                }
            }
            return categoryRepository.save(entity);
        }
    }
    @Override
    public List<Category> findAll(){
        return categoryRepository.findAll();
    }
    @Override
    public Page<Category> findAll(Pageable pageable){
        return categoryRepository.findAll(pageable);
    }
    @Override
    public List<Category> findAll(Sort sort){
        return categoryRepository.findAll(sort);
    }
    @Override
    public List<Category> findAllById(Iterable<Long> ids){
        return categoryRepository.findAllById(ids);
    }
    @Override
    public Optional<Category> findById(Long id){
        return categoryRepository.findById(id);
    }
    @Override
    public <S extends Category> Optional<S> findOne(Example<S> example){
        return categoryRepository.findOne(example);
    }
    @Override
    public long count()
    {
        return categoryRepository.count();
    }
    @Override
    public void deleteById(Long id) {
        categoryRepository.deleteById(id);
    }
    @Override
    public void delete(Category entity) {
        categoryRepository.delete(entity);
    }
    @Override
    public void deleteAll() {
        categoryRepository.deleteAll();
    }
    @Override
    public List<Category> findByNameContaining(String name){
        return categoryRepository.findByNameContaining(name);
    }
    @Override
    public Page<Category> findByNameContaining(String name, Pageable pageable){
        return categoryRepository.findByNameContaining(name,pageable);
    }
}

