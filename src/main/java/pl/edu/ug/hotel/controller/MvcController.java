package pl.edu.ug.hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pl.edu.ug.hotel.domain.user.entity.User;

import javax.validation.Valid;

@Controller
public class MvcController {

    @PostMapping("/reg/processing")
    public String registration(@Valid User user){
        return "redirect:/login?SuccesRegistred";
    }
}
