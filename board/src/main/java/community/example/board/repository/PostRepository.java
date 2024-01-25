package community.example.board.repository;

import community.example.board.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class PostRepository {
    private final List<Post> posts = new ArrayList<>();
    private Long id = 1L;


    public Post save(Post post) {
        post.setId(id++);
        posts.add(post);
        return post;
    }
}
