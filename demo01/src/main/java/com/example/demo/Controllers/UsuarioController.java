package com.example.demo.Controllers;

import com.example.demo.Models.User;
import com.example.demo.Services.UsuarioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioServices usuarioServices;

    @GetMapping() public ArrayList<User> obtenerUsuario(){
        return usuarioServices.obtenerUsusarios();
    }

    @PostMapping() public User guardarUser(@RequestBody User usuario){
        return this.usuarioServices.guardarUsuario(usuario);
    }

}
