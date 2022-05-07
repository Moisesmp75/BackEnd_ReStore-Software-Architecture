package com.example.demo.Services;

import com.example.demo.Models.Order;
import com.example.demo.Repositories.OrdenesRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class OrdenesServices {
    @Autowired
    OrdenesRepositories ordenesrepositorio;

    public ArrayList<Order> ObtenerOrdenes(){
        return (ArrayList<Order>)ordenesrepositorio.findAll();
    }
    public Order guardarOrder(Order orden){
        return ordenesrepositorio.save(orden);
    }

}
