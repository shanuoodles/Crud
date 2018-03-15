package com.example.many2many.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.many2many.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
	public List<Post> findByTitle(String title);

}