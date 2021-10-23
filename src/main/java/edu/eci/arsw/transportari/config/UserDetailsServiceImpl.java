package edu.eci.arsw.transportari.config;

import edu.eci.arsw.transportari.model.entity.Usuario;
import edu.eci.arsw.transportari.repository.IUsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private IUsuarioRepo usuarioRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepo.findByUsername(username);
        UserBuilder builder = null;

        if (usuario != null){
            builder = User.withUsername(username);
            builder.disabled(false);
            builder.password(usuario.getClave());
            builder.authorities(new SimpleGrantedAuthority("ROL_USUARIO"));
        } else {
            throw new UsernameNotFoundException("Usuario no existe");
        }

        return builder.build();
    }
}
