package com.example.aulaspringweb.controller;

import com.example.aulaspringweb.model.Usuario;
import com.example.aulaspringweb.repository.UsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepo repodousu;

    @GetMapping("/users")
    public List<Usuario> getUsua(){
        return repodousu.findAll();
    }

    @GetMapping("/users/{username}")
    public Usuario getOne(@PathVariable("username") String username){
        return repodousu.findByUsername(username);
    }
}
