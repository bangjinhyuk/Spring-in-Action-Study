package com.example.tacoexam.data;

import com.example.tacoexam.Order;
import org.aspectj.weaver.ast.Or;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by bangjinhyuk on 2021/12/04.
 */
public interface OrderRepository extends CrudRepository<Order,Long> {
}
