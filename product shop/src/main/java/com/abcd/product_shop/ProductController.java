package com.abcd.product_shop;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("/product")
public class ProductController {
    private final List<Product> products = new ArrayList<> ();


    @GetMapping("/add")
    public String showForm(Model model){
        model.addAttribute("product",new Product());
        return "from";
    }
    @PostMapping("/add")
    public String submit(@Valid @ModelAttribute Product product, BindingResult bindingResult)
    {
        log.info("product {} submit recevied ",product);
        if(bindingResult.hasErrors()){
            return "from";
        }
        products.add(product);
        return "redirect:/product/add";
    }


    //List
    @GetMapping("list")
    public String list(Model model){
        model.addAttribute("products",products);
        return "list";
    }

    @GetMapping("/edit/{id}")
    public String editProduct(@PathVariable int id, Model model) {

        Product product = products.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);

        if (product == null) {
            return "redirect:/product/list";
        }

        model.addAttribute("product", product);
        return "from";
    }

    @PostMapping("/update")
    public String updateProduct(@Valid @ModelAttribute Product product,
                                BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "from";
        }

        products.replaceAll(p ->
                p.getId() == product.getId() ? product : p);

        return "redirect:/product/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {

        products.removeIf(product -> product.getId() == id);

        return "redirect:/product/list";
    }


}
