package com.example.demo.persistence.repository.impl;

import com.example.demo.persistence.model.Cocktail;
import com.example.demo.persistence.repository.CocktailRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CocktailRepositoryImpl implements CocktailRepository {

    List<Cocktail> cocktailList;


    @Override
    public Optional<Cocktail> findById(Long id) {
        return cocktailList.stream().filter(cocktail -> cocktail.getId() == id).findFirst();
    }

    @Override
    public Cocktail save(Cocktail cocktail) {
        Cocktail existingCocktail = findById(cocktail.getId()).orElse(null);
        if (existingCocktail == null) {
            cocktailList.add(cocktail);
        } else {
            cocktailList.remove(existingCocktail);
            cocktailList.add(cocktail);
        }
        return cocktail;
    }
}
