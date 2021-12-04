package com.example.tacoexam.data;

import com.example.tacoexam.Taco;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by bangjinhyuk on 2021/12/04.
 */
public interface TacoRepository extends CrudRepository<Taco,Long> {
}
