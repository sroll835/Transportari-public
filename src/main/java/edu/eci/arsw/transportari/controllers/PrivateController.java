package edu.eci.arsw.transportari.controllers;

import edu.eci.arsw.transportari.model.entity.Usuario;
import edu.eci.arsw.transportari.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/private")
public class PrivateController {

    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping("/index")
    public String index(Authentication auth, HttpSession session){
        String username = auth.getName();

        if (session.getAttribute("usuario") == null){
            Usuario usuario = usuarioService.findByUsername(username);
            usuario.setClave(null);
            session.setAttribute("usuario", usuario);
        }
        return "index";
    }
}
