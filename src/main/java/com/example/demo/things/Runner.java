package com.example.demo.things;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Runner implements CommandLineRunner {
    Posts posts;

    @Override
    public void run(String... args) {
        Post post = new Post();
        post.addComment(new Comment());
        posts.save(post);
        System.out.println(posts.findById(post.getId()));
    }
}
