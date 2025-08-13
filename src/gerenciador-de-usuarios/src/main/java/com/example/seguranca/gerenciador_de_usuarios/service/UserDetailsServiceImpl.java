package com.example.seguranca.gerenciador_de_usuarios.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.seguranca.gerenciador_de_usuarios.entity.User;
import com.example.seguranca.gerenciador_de_usuarios.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

  private final UserRepository userRepository;

  public UserDetailsServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    User user = userRepository.findByUsername(username)
    .orElseThrow(() -> new UsernameNotFoundException("User not found"));

    return org.springframework.security.core.userdetails.User.builder()
        .username(user.getUsername())
        .password(user.getPassword())
        .roles(user.getRole().name())
        .build();
  }
}
