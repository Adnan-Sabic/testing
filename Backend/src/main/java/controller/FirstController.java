package controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping
    public String getTest() {
        return "Ado";
    }

    @GetMapping
    public String getTest2() {
        return "Sabic";
    }
}
