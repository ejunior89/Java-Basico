package com.example.blog.blog_pessoal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	public ResponseEntity<Post> createPost(@RequestBody Post post) {
		if (post.getTitulo() == null || post.getTitulo().trim().isEmpty()) {
			return ResponseEntity.badRequest().build();
		}
		if (post.getConteudo() == null || post.getConteudo().trim().isEmpty()) {
			return ResponseEntity.badRequest().build();
		}
		Post savedPost = postRepository.save(post);
		return ResponseEntity.ok(savedPost);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Post> getPostById(@PathVariable Long id) {
		return postRepository.findById(id)
			.map(post -> ResponseEntity.ok(post))
			.orElse(ResponseEntity.notFound().build());
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletePost(@PathVariable Long id) {
		if (!postRepository.existsById(id)) {
			return ResponseEntity.notFound().build();
		}
		postRepository.deleteById(id);
		return ResponseEntity.noContent().build();
	}
}
