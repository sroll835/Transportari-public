package edu.eci.arsw.transportari.impl;

import edu.eci.arsw.transportari.model.entity.Usuario;
import edu.eci.arsw.transportari.repository.IUsuarioRepo;
import edu.eci.arsw.transportari.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    private IUsuarioRepo usuarioRepo;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public Usuario findByUsername(String username) {
        return usuarioRepo.findByUsername(username);
    }

    @Override
    public Usuario registrar(Usuario usuario) {
        usuario.setClave(passwordEncoder.encode(usuario.getClave()));
        return usuarioRepo.save(usuario);
    }
}
