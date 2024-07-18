package RedisTS.demo.Controller;

import RedisTS.demo.Service.TestService;
import RedisTS.demo.domain.TestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    TestService svc;

    @Cacheable(value = "TestVo", key = "#id", cacheManager = "cacheManager", unless = "#id == ''")
    @GetMapping("/getTest")
    public TestVo getData(@RequestParam(value = "id") String id ){

        return svc.getTestSvc(id);
    }
}
