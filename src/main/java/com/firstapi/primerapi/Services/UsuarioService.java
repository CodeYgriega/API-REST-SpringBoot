package com.firstapi.primerapi.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstapi.primerapi.Models.UsuarioModel;
import com.firstapi.primerapi.Repositories.UsuarioRepository;

@Service
public class UsuarioService {
    
    @Autowired
    UsuarioRepository usuarioRepository;

    public List<UsuarioModel> obtenerUsuarios(){
        return usuarioRepository.findAll();
    }

    public UsuarioModel guardarUsuario(UsuarioModel usuario){
        return usuarioRepository.saveAndFlush(usuario);
    }
}
