package community.example.board.Controller;

import community.example.board.Post;
import community.example.board.repository.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Controller 와 Responbody 를 합친 것이다. -> 보통 REST API 를 구현하는 데 사용함.
public class PostController {
    private final PostRepository postRepository;

    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @PostMapping("/posts")
    public String create(@ModelAttribute Post post) {
        postRepository.save(post);
        return "list";  //저장 후 게시글 목록으로 이동
    }

    @GetMapping("/post")
    public List<Post> getAll() {
        return postRepository.findAll();
    }

    @Controller
    public class MyController {
        @GetMapping("/create")
        public String create() {
            return "create";
        }
    }


}

