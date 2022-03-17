package com.bbangi.tacorealexam.data;

import com.bbangi.tacorealexam.Order;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by bangjinhyuk on 2022/03/17.
 */
public interface OrderRepository extends CrudRepository<Order, Long> {

}
