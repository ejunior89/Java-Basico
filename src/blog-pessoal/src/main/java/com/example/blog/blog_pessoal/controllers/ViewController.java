package com.example.blog.blog_pessoal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.blog.blog_pessoal.model.Post;
import com.example.blog.blog_pessoal.repository.PostRepository;

@Controller
public class ViewController {

	@Autowired
	private PostRepository postRepository;

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("posts", postRepository.findAll());
		model.addAttribute("post", new Post());
		return "index";
	}

	@PostMapping("/create")
	public String createPost(@ModelAttribute Post post) {
		postRepository.save(post);
		return "redirect:/";
	}
}
