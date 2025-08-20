package com.example.seguranca.gerenciador_de_usuarios.controller;

import com.example.seguranca.gerenciador_de_usuarios.entity.User;
import com.example.seguranca.gerenciador_de_usuarios.repository.UserRepository;
import com.example.seguranca.gerenciador_de_usuarios.entity.Role;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private UserRepository userRepository;

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

    @Test
    @WithMockUser(username= "admin", roles = {"ADMIN"})
    public void testGetUserById() throws Exception {
        User user = new User();
        user.setUsername("test_get");
        user.setPassword("password");
        user.setRole(Role.USER);
        userRepository.save(user);

        mockMvc.perform(get("/users/" + user.getId()))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.username").value("test_get"))
                .andExpect(jsonPath("$.role").value("USER"));
    }


    @Test
    @WithMockUser(username= "admin", roles = {"ADMIN"})
    public void testUpdateUser() throws Exception {
        User user = new User();
        user.setUsername("test_put");
        user.setPassword("old_password");
        user.setRole(Role.USER);
        userRepository.save(user);

        user.setUsername("updated_put");
        user.setPassword("new_password");

        mockMvc.perform(put("/users/" + user.getId())
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(user)))
                .andExpect(status().isOk())
                .andExpect(content().string("Usuário atualizado com sucesso"));
    }

    @Test
    @WithMockUser(username= "admin", roles = {"ADMIN"})
    public void testDeleteUser() throws Exception {
        User user = new User();
        user.setUsername("test_delete");
        user.setPassword("password");
        user.setRole(Role.USER);
        userRepository.save(user);

        mockMvc.perform(delete("/users/" + user.getId()))
                .andExpect(status().isOk())
                .andExpect(content().string("Usuário deletado com sucesso"));
    }
}



