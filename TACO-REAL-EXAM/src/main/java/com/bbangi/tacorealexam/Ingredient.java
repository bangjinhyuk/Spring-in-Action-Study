package com.bbangi.tacorealexam;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * Created by bangjinhyuk on 2022/03/07.
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
