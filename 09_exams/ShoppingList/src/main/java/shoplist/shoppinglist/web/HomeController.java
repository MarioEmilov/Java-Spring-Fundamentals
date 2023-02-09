package shoplist.shoppinglist.web;

import org.springframework.ui.Model;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import shoplist.shoppinglist.model.enums.CategoryName;
import shoplist.shoppinglist.service.ProductService;

@Controller
public class HomeController {

    private final ProductService productService;

    public HomeController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public String index(HttpSession httpSession, Model model) {

        //We are checking if we have login user or not and we redirect him
        if (httpSession.getAttribute("user") == null) {
            return "index";
        }
        model.addAttribute("totalSum", productService.getTotalSum());
        model.addAttribute("food", productService.findAllProductsByCategoryName(CategoryName.FOOD));
        model.addAttribute("drinks", productService.findAllProductsByCategoryName(CategoryName.DRINK));
        model.addAttribute("households", productService.findAllProductsByCategoryName(CategoryName.HOUSEHOLD));
        model.addAttribute("others", productService.findAllProductsByCategoryName(CategoryName.OTHER));
        return "home";

    }
}
