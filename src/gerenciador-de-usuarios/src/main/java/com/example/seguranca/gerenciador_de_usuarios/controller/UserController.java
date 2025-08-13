package com.example.seguranca.gerenciador_de_usuarios.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.seguranca.gerenciador_de_usuarios.entity.User;
import com.example.seguranca.gerenciador_de_usuarios.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

  private final UserRepository userRepository;

  private final PasswordEncoder passwordEncoder;

  public UserController(UserRepository userRepository, PasswordEncoder passwordEncoder) {
      this.userRepository = userRepository;
      this.passwordEncoder = passwordEncoder;
  }

  @PostMapping("/register")
  public ResponseEntity<String> registerUser(@RequestBody User user) {
    user.setPassword(passwordEncoder.encode(user.getPassword()));
    userRepository.save(user);
    return new ResponseEntity<>("Usuário Registrado com sucesso", HttpStatus.CREATED);
  }

  @GetMapping
  public ResponseEntity<List<User>> listUsers() {
      List<User> users = userRepository.findAll();
      return new ResponseEntity<>(users, HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<User> getUserById(@PathVariable Long id) {
      return userRepository.findById(id)
              .map(user -> new ResponseEntity<>(user, HttpStatus.OK))
              .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

  @PutMapping("/{id}")
  public ResponseEntity<String> updateUser(@PathVariable Long id, @RequestBody User user) {
      return userRepository.findById(id)
              .map(existingUser -> {
                  existingUser.setUsername(user.getUsername());
                  existingUser.setPassword(passwordEncoder.encode(user.getPassword()));
                  userRepository.save(existingUser);
                  return new ResponseEntity<>("Usuário atualizado com sucesso", HttpStatus.OK);
              })
              .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<String> deleteUser(@PathVariable Long id) {
      return userRepository.findById(id)
              .map(existingUser -> {
                  userRepository.delete(existingUser);
                  return new ResponseEntity<>("Usuário deletado com sucesso", HttpStatus.OK);
              })
              .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }
}