package edu.eci.arsw.transportari.repository;

import edu.eci.arsw.transportari.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepo extends JpaRepository<Usuario, Long> {
    public Usuario findByUsername(String username);
}
