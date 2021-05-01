package com.example.demo.things;

import lombok.Getter;
import lombok.ToString;
import lombok.Value;
import org.jmolecules.ddd.types.AggregateRoot;
import org.jmolecules.ddd.types.Identifier;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@ToString
public class Post implements AggregateRoot<Post, Post.PostId> {
    private final PostId id;
    private List<Comment> comments;

    public Post() {
        id = PostId.of(UUID.randomUUID());
        comments = new ArrayList<>();
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    @Value(staticConstructor = "of")
    public static class PostId implements Identifier {
        UUID id;
    }
}
