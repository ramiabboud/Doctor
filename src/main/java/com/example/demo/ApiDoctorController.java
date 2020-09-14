package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiDoctorController {

    @Autowired
    private DoctorService service;

    @PostMapping("/api/addDoctor")
    public DoctorEntity addProduct(@RequestBody DoctorEntity product) {
        return service.saveDoctor(product);
    }

    @PostMapping("/api/addDoctors")
    public List<DoctorEntity> addProducts(@RequestBody List<DoctorEntity> products) {
        return service.saveDoctors(products);
    }

    @GetMapping("/api/doctors")
    public List<DoctorEntity> findAllProducts() {
        return service.getDoctor();
    }

    @GetMapping("/api/doctorById/{id}")
    public DoctorEntity findProductById(@PathVariable int id) {
        return service.getDoctorById(id);
    }

    /*@GetMapping("/doctor/{name}")
    public DoctorEntity findProductByName(@PathVariable String name) {
        return service.getDoctorByName(name);
    }*/

    @PutMapping("/api/update")
    public DoctorEntity updateProduct(@RequestBody DoctorEntity product) {
        return service.updateDoctor(product);
    }

    @DeleteMapping("/api/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteDoctor(id);
    }
}
