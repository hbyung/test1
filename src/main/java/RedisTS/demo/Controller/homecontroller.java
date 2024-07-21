package RedisTS.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class homecontroller {

    @GetMapping("/h1")
    public String home1 (){
        return "index";
    }
}
