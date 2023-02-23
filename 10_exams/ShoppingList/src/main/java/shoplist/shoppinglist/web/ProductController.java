package shoplist.shoppinglist.web;
import jakarta.servlet.http.HttpSession;
import org.modelmapper.ModelMapper;
import org.springframework.ui.Model;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import shoplist.shoppinglist.model.binding.ProductAddBindingModel;
import shoplist.shoppinglist.model.service.ProductServiceModel;
import shoplist.shoppinglist.service.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;
    private final ModelMapper modelMapper;

    public ProductController(ProductService productService, ModelMapper modelMapper) {
        this.productService = productService;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/add")
    public String add(Model model, HttpSession httpSession) {
        //We want if user is not login to don't have access in adding products
        if (httpSession.getAttribute("user") == null) {
            return "redirect:/login";
        }
        if (!model.containsAttribute("productAddBindingModel")) {
            model.addAttribute("productAddBindingModel", new ProductAddBindingModel());
        }
        return "product-add";
    }

    @PostMapping("/add")
    public String addConfirm(@Valid ProductAddBindingModel productAddBindingModel,
                             BindingResult bindingResult,
                             RedirectAttributes redirectAttributes){
        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("productAddBindingModel", productAddBindingModel);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.productAddBindingModel", bindingResult);
            return "redirect:add";
        }

        //Save product in DB
        productService
                .add(modelMapper.map(productAddBindingModel, ProductServiceModel.class));
        return "redirect:/";
    }

    @GetMapping("/buy/{id}")
    public String buyById(@PathVariable String id){
        productService.buyById(id);
        return "redirect:/";
    }

    @GetMapping("/buy/all")
    public String buyAll(){
        productService.buyAll();
        return "redirect:/";
    }
}
