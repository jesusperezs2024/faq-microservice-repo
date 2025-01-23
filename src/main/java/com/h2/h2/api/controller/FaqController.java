package com.h2.h2.api.controller;

import com.h2.h2.api.model.FaqModel;
import com.h2.h2.api.service.FaqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/faq")
public class FaqController {
    @Autowired
    private FaqService productService;

    @GetMapping("prueba")
    public String prueba() {
        return "Ok, se ha recibido tu solicitud";
    }

    @GetMapping("GetAll")
    public List<FaqModel> listar() {
        return productService.listados();
    }

    @PostMapping("Create")
    public FaqModel create(@RequestBody FaqModel unidadOperativa) {
        return productService.crear(unidadOperativa);
    }

    @PutMapping("{id}")
    public FaqModel update(@PathVariable Long id, @RequestBody FaqModel unidadOperativa) {
        unidadOperativa.setIdFaq(id);
        return productService.update(unidadOperativa);
    }
    

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        productService.delete(id);
    }
}
