package com.example.many2many.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.many2many.model.Post;
import com.example.many2many.model.Tag;
import com.example.many2many.service.Many2manyService;
@RestController
public class Many2manyController {
	
	@Autowired
	Many2manyService servic;
	
	@RequestMapping(method=RequestMethod.POST,value="/post")
	public void addUserDetails(@RequestBody String  post) {
		
		 // Create three tags
        Tag tag1 = new Tag("A1");
        Tag tag2 = new Tag("A2");
        Tag tag3 = new Tag("A3");
        
        Post post1 = new Post("Hello",
                "Hello Guys",
                "Hello Guys !  How r u?");

        servic.savePost_Tag( post1, tag1, tag2,tag3);
	}
	@RequestMapping("/getPost/{title}")
	public List<Post> getpost(@PathVariable String title) {
		System.out.println("ss"+servic.getpost(title));
		 return servic.getpost(title);
	}
	
	@RequestMapping("/deletePost/{id}")
	public void deletepost(@PathVariable Long id) {
		  servic.deletepost(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/updatePost{id}")
	public void updatePost(@RequestBody Long  id) {
		 // Create two tags
        Tag tag1 = new Tag("b1");
        Tag tag2 = new Tag("b2");
        Tag tag3 = new Tag("b3");
        
        Post post1 = new Post("11Hibernate Many to Many Example with Spring Boot",
                "1111Learn how to map a many to many relationship using hibernate",
                "1111111Entire Post content with Sample code");

        servic.updatePost( post1, tag1, tag2,tag3 ,id);
		
		
	}
	
	
	

}
