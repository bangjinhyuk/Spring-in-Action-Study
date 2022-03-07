package com.bbangi.tacorealexam;

import lombok.Data;

import java.util.List;

/**
 * Created by bangjinhyuk on 2022/03/07.
 */
@Data
public class Taco {
    private String name;
    private List<String> ingredients;
}
