package RedisTS.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class homecontroller {

    @GetMapping("/hello")
    public String home1 (){
        return "./test/test";
    }

}
