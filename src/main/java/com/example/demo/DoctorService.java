package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.UserRepository;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    private UserRepository repository;

    public DoctorEntity saveDoctor(DoctorEntity doc) {
        return repository.save(doc);
    }

    public List<DoctorEntity> saveDoctors(List<DoctorEntity> doctors) {
        return repository.saveAll(doctors);
    }

    public List<DoctorEntity> getDoctor() {
        return repository.findAll();
    }

    public DoctorEntity getDoctorById(int id) {
        return (DoctorEntity) repository.findById(id);
    }

    /*public DoctorEntity getDoctorByName(String name) {
        return repository.findByName(name);
    }*/

    public String deleteDoctor(int id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }

    public DoctorEntity updateDoctor(DoctorEntity doctor) {
    	DoctorEntity existingDoctor = (DoctorEntity) repository.findById(doctor.getId());
        existingDoctor.setFirstName(doctor.getFirstName());
        existingDoctor.setLastName(doctor.getLastName());
        existingDoctor.setNumber(doctor.getNumber());
        existingDoctor.setPassword(doctor.getPassword());
        existingDoctor.setAge(doctor.getAge());
        return repository.save(existingDoctor);
    }


}
