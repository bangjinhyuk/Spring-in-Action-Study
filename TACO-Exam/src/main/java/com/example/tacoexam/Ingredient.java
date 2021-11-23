package com.example.tacoexam;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * Created by bangjinhyuk on 2021/11/23.
 */
@Data
@RequiredArgsConstructor
public class Ingredient {

    private final String id;
    private final String name;
    private final Type type;

    public static enum Type{
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
