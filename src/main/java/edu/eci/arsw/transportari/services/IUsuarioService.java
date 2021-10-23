package edu.eci.arsw.transportari.services;

import edu.eci.arsw.transportari.model.entity.Usuario;

public interface IUsuarioService {
    public Usuario findByUsername(String username);
    public Usuario registrar(Usuario usuario);
}
