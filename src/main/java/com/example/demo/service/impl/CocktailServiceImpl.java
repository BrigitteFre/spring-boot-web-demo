package com.example.demo.service.impl;

import com.example.demo.persistence.model.Cocktail;
import com.example.demo.persistence.repository.CocktailRepository;
import com.example.demo.service.CocktailService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CocktailServiceImpl implements CocktailService {

    private final CocktailRepository cocktailRepository;

    public CocktailServiceImpl(CocktailRepository cocktailRepository) {
        this.cocktailRepository = cocktailRepository;
    }

    @Override
    public Optional<Cocktail> findById(Long id) {
        return cocktailRepository.findById(id);
    }

    @Override
    public Cocktail save(Cocktail cocktail) {
       return cocktailRepository.save(cocktail);
    }
}
