package community.example.board.Controller;

import community.example.board.Post;
import community.example.board.repository.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController // Controller 와 Responbody 를 합친 것이다. -> 보통 REST API 를 구현하는 데 사용함.
public class PostController {
    private final PostRepository postRepository;

    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @PostMapping("/posts")
    public Post create(@RequestBody Post post) {
        return postRepository.save(post);
    }

    @Controller
    public class MyController {
        @GetMapping("/create")
        public String create() {
            return "create";
        }
    }
}

