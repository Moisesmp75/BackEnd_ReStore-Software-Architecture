package com.example.demo.Repositories;

import com.example.demo.Models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UsuarioRepositories extends CrudRepository<User,Long> {

}
