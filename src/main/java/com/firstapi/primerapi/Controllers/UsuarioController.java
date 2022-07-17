package com.firstapi.primerapi.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.firstapi.primerapi.Models.UsuarioModel;
import com.firstapi.primerapi.Services.UsuarioService;

@RestController
public class UsuarioController {
    
    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/api")
    public List<UsuarioModel> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }

    @PostMapping
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario){
        return usuarioService.guardarUsuario(usuario);
    }
}
