package com.example.seguranca.gerenciador_de_usuarios.controller;

import com.example.seguranca.gerenciador_de_usuarios.entity.Role;
import com.example.seguranca.gerenciador_de_usuarios.entity.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.mock.http.server.reactive.MockServerHttpRequest.post;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testRegisterUserIntegration() throws Exception {
        // Given
        User newUser = new User();
        newUser.setUsername("integration_user");
        newUser.setPassword("password_test");
        newUser.setRole(Role.USER);

        // When
        mockMvc.perform(post("/users/register")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(newUser)))
                // Then
                .andExpect(status().isCreated())
                .andExpect(content().string("Usuário Registrado com sucesso"));
    }
}

