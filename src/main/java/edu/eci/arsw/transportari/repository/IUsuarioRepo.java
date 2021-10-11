package edu.eci.arsw.transportari.repository;

import edu.eci.arsw.transportari.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer> {

    Usuario findByNombre(String nombre);
}
