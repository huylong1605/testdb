package com.example.TestDB3.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

public class ProductController {

    @Autowired
    private ProductRepository repository;


    @GetMapping("/")
    public String home() {
        return "index";
    }
    @GetMapping("/products")
    public String ShowAll(Model model){

         List<Product> list = repository.findAll();
      model.addAttribute("products", list);
      return "list";
    }

    @GetMapping("/add-product")
    public String showAddProductForm(Model model) {
        model.addAttribute("products", new Product());
        return "add_product";
    }

    @PostMapping("/Add_products")
    public String addProduct(@ModelAttribute Product product) {
        repository.save(product);
        return "redirect:/products";
    }

    @GetMapping("/delete-product/{id}")
    public String deleteProduct(@PathVariable Long id) {
       repository.deleteById(id);
        return "redirect:/products";
    }
}
