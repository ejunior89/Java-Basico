package com.example.blog.blog_pessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.blog.blog_pessoal.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
