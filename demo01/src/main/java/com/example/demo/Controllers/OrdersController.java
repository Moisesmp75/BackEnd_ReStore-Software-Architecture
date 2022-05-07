package com.example.demo.Controllers;

import com.example.demo.Models.Order;
import com.example.demo.Services.OrdenesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/Order")
public class OrdersController {
    @Autowired
    OrdenesServices ordenesServices;

    @GetMapping() public ArrayList<Order> ObtenerOrder(){
        return ordenesServices.ObtenerOrdenes();
    }
    @PostMapping public Order GuardarOrder(@RequestBody Order order){
        return this.ordenesServices.guardarOrder(order);
    }
}
