package com.example.seguranca.gerenciador_de_usuarios.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Login bem-sucedido!";
    }

    @GetMapping("/public")
    public String publicPage() {
        return "Página pública acessível a todos";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminPage() {
        return "Esta é uma pagina de adminm acessivel apenas aos admins.";
    }
}
