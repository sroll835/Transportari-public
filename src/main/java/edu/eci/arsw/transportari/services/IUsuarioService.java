package edu.eci.arsw.transportari.services;

import edu.eci.arsw.transportari.model.entity.Usuario;

public interface IUsuarioService {
    Usuario findByUsername(String username);
    Usuario registrar(Usuario usuario);
}
