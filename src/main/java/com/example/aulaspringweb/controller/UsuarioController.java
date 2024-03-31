package com.example.aulaspringweb.controller;

import com.example.aulaspringweb.model.Usuario;
import com.example.aulaspringweb.repository.UsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UsuarioRepo repodousu;

    @GetMapping()
    public List<Usuario> getUsua(){
        return repodousu.findAll();
    }

    @GetMapping("/{username}")
    public Usuario getOne(@PathVariable("username") String username){
        return repodousu.findByUsername(username);
    }

    @DeleteMapping("/{id}")
    public void delete(Integer id){
        repodousu.deleteById(id);
    }

    @PostMapping()
    public void postUsuario(@RequestBody Usuario usuario){
        repodousu.save(usuario);
    }

    @PutMapping()
    public void putUsuario(@RequestBody Usuario usuario){
        repodousu.save(usuario);
    }
}
