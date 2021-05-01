package com.example.demo.things;

import org.jmolecules.ddd.types.Repository;

@org.springframework.stereotype.Repository
public interface Posts extends Repository<Post, Post.PostId> {
    Post save(Post post);

    Post findById(Post.PostId id);
}
