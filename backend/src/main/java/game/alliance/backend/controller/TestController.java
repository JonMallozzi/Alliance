package game.alliance.backend.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/")
public class TestController {
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public String hello(){
        return "Hello World";
    }
}
