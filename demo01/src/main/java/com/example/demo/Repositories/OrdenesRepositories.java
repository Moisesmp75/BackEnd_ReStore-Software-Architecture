package com.example.demo.Repositories;

import com.example.demo.Models.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdenesRepositories extends CrudRepository<Order,Long> {
}
