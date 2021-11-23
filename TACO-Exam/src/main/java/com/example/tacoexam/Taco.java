package com.example.tacoexam;

import lombok.Data;

import java.util.List;

/**
 * Created by bangjinhyuk on 2021/11/23.
 */
@Data
public class Taco {
    private String name;
    private List<String> ingredients;

}
