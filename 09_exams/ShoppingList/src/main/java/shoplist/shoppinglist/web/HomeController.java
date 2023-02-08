package shoplist.shoppinglist.web;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(HttpSession httpSession) {

        //We are checking if we have login user or not and we redirect him
        return httpSession.getAttribute("user") == null
        ? "index" : "home";

    }
}
