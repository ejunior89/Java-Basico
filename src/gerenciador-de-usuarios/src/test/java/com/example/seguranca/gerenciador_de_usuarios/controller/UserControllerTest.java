package com.example.seguranca.gerenciador_de_usuarios.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.seguranca.gerenciador_de_usuarios.entity.User;
import com.example.seguranca.gerenciador_de_usuarios.repository.UserRepository;

@ExtendWith(MockitoExtension.class)
public class UserControllerTest {

    @Mock
    private UserRepository userRepository;

    @Mock
    private PasswordEncoder passwordEncoder;

    @InjectMocks
    private UserController userController;

    private User testUser;

    @BeforeEach
    public void setup() {
        testUser = new User();
        testUser.setUsername("testuser");
        testUser.setPassword("rawpassword");
    }

    @Test
    public void testRegisterUserSuccess() {
        // Given
        when(passwordEncoder.encode("rawpassword")).thenReturn("encodedpassword");
        when(userRepository.save(any(User.class))).thenReturn(testUser);

        // When
        ResponseEntity<String> response = userController.registerUser(testUser);

        // Then
        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertEquals("Usuário Registrado com sucesso", response.getBody());
    }
}