package com.example.demo.things;

import lombok.Getter;
import lombok.Value;
import org.jmolecules.ddd.types.Entity;
import org.jmolecules.ddd.types.Identifier;

import java.util.UUID;

@Getter
public class Comment implements Entity<Post, Comment.CommentId> {
    private final CommentId id;

    public Comment() {
        this.id = CommentId.of(UUID.randomUUID());
    }

    @Value(staticConstructor = "of")
    static public class CommentId implements Identifier {
        private UUID id;
    }
}
