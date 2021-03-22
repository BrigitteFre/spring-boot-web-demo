package com.example.demo.service;

import com.example.demo.persistence.model.Cocktail;

import java.util.Optional;

public interface CocktailService {

    Optional<Cocktail> findById(Long id);

    Cocktail save(Cocktail cocktail);
}
