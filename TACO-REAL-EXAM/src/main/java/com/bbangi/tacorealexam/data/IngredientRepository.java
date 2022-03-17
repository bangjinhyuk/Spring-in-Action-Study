package com.bbangi.tacorealexam.data;

import com.bbangi.tacorealexam.Ingredient;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by bangjinhyuk on 2022/03/17.
 */
public interface IngredientRepository extends CrudRepository<Ingredient, String> {

}
