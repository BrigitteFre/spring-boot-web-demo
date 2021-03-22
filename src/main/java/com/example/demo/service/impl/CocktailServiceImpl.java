package com.example.demo.service.impl;

import com.example.demo.persistence.model.Cocktail;
import com.example.demo.persistence.repository.CocktailRepository;
import com.example.demo.service.CocktailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CocktailServiceImpl implements CocktailService {

    @Autowired
    CocktailRepository cocktailRepository;

    @Override
    public Optional<Cocktail> findById(Long id) {
        return cocktailRepository.findById(id);
    }

    @Override
    public Cocktail save(Cocktail cocktail) {
       return cocktailRepository.save(cocktail);
    }
}
