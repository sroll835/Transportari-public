package edu.eci.arsw.transportari.controllers;

import edu.eci.arsw.transportari.model.entity.Usuario;
import edu.eci.arsw.transportari.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping("/auth/registro")
    public String registroForm(Model model){
        model.addAttribute("usuario", new Usuario());

        return "login";
    }

    @PostMapping("/auth/registro")
    public String registro(@ModelAttribute Usuario usuario, BindingResult result, Model model){
        if (result.hasErrors()){
            return "redirect:/auth/registro";
        } else {
            model.addAttribute("usuario", usuarioService.registrar(usuario));
        }

        return "redirect:/auth/login";
    }

    @GetMapping("/auth/login")
    public String login(Model model){
        model.addAttribute("usuario", new Usuario());
        return "login";
    }
}
