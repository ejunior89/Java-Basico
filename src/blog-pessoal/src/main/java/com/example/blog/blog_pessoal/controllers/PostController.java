package com.example.blog.blog_pessoal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.blog.blog_pessoal.model.Post;
import com.example.blog.blog_pessoal.repository.PostRepository;

@RestController
@RequestMapping("/posts")
public class PostController {

  @Autowired
  private PostRepository postRepository;

  @GetMapping
  public List<Post> getAllPosts() {
      return postRepository.findAll();
  }

  @PostMapping
  public Post createPost(@RequestBody Post post) {
      return postRepository.save(post);
  }

  @GetMapping("/{id}")
  public Post getPostById(@PathVariable Long id) {
    return postRepository.findById(id).orElse(null);
  }

  @DeleteMapping("/{id}")
  public void deletePost(@PathVariable Long id) {
      postRepository.deleteById(id);
  }
}
