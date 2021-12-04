package com.example.tacoexam.data;

import com.example.tacoexam.Ingredient;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by bangjinhyuk on 2021/12/04.
 */
public interface IngredientRepository extends CrudRepository<Ingredient,String> {
}
