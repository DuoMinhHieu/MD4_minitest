package com.example.minitest1.controller;


import com.example.minitest1.model.Car;
import com.example.minitest1.model.Type;
import com.example.minitest1.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/cars")
@Validated
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping
    public String getAllCars(Model model) {
        List<Car> cars = carService.getAllCars();
        model.addAttribute("cars", cars);
        return "cars";
    }

    @GetMapping("/add")
    public String addCarForm(Model model) {
        Car car = new Car();
        List<Type> types = Arrays.asList(
                new Type(1, "SUV"),
                new Type(2, "Sedan"),
                new Type(3, "Truck")
        );
        model.addAttribute("car", car);
        model.addAttribute("types", types);
        return "addCar";
    }

    @PostMapping
    public String addCar(@Valid @ModelAttribute Car car, Model model) {
        carService.addCar(car);
        return "redirect:/cars";
    }
}
