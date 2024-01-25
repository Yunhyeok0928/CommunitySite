package community.example.board.Controller;


import community.example.board.repository.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    private final PostRepository postRepository;

    public ViewController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }


    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("posts", postRepository.findAll());
        return "list";
    }
}
