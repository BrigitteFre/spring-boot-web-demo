package com.example.demo.persistence.repository;

import com.example.demo.persistence.model.Cocktail;

import java.util.Optional;

public interface CocktailRepository {

    Optional<Cocktail> findById(Long id);

    Cocktail save(Cocktail cocktail);
}
