package com.example.minitest1.controller;

import com.example.minitest1.model.Type;
import com.example.minitest1.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/types")
public class TypeController {

    @Autowired
    private TypeService typeService;
    @GetMapping
    public List<Type> getAllTypes() {
        return typeService.findAll();
    }

    @GetMapping("/{id}")
    public Type getTypeById(@PathVariable Long id) {
        return typeService.findById(id);
    }

    @PostMapping
    public Type createType(@Valid @RequestBody Type type) {
        return typeService.save(type);
    }

    @PutMapping("/{id}")
    public Type updateType(@PathVariable Long id, @Valid @RequestBody Type type) {
        type.setId(id);
        return typeService.save(type);
    }

    @DeleteMapping("/{id}")
    public void deleteType(@PathVariable Long id) {
        typeService.deleteById(id);
    }
}
