package com.example.many2many.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.many2many.model.Post;
import com.example.many2many.model.Tag;
import com.example.many2many.repository.PostRepository;
@Service
public class Many2manyService {
	
	@Autowired PostRepository postRepo;

	

	public void savePost_Tag(Post post, Tag tag1, Tag tag2, Tag tag3) {
		// Add tag references in the post
        post.getTags().add(tag1);
        post.getTags().add(tag2);
        post.getTags().add(tag3);

        // Add post reference in the tags
        tag1.getPosts().add(post);
        tag2.getPosts().add(post);
        tag3.getPosts().add(post);

        postRepo.save(post);
		
	}
	public List<Post> getpost(String title) {
		System.out.println("ss"+postRepo.findByTitle(title));
		return postRepo.findByTitle(title);
		// postRepo.findOne(id);
	}
	public void deletepost(Long id) {
		
		postRepo.delete(id);
		
	}
	public void updatePost(Post post, Tag tag1, Tag tag2, Tag tag3,Long id) {
		// Add tag references in the post
        post.getTags().add(tag1);
        post.getTags().add(tag2);
        post.getTags().add(tag3);

        // Add post reference in the tags
        tag1.getPosts().add(post);
        tag2.getPosts().add(post);
        tag3.getPosts().add(post);

        postRepo.save(post);
		
		
	}

}
