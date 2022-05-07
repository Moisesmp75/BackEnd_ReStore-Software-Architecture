package com.example.demo.Services;

import com.example.demo.Models.User;
import com.example.demo.Repositories.UsuarioRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioServices {
    @Autowired
    UsuarioRepositories usuarioRepository;
    public ArrayList<User> obtenerUsusarios(){
        return (ArrayList<User>)usuarioRepository.findAll();
    }
    public User guardarUsuario(User usuario){
        return usuarioRepository.save(usuario);
    }

}







