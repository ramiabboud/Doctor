package com.example.demo.DTO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DoctorEntity;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
    private UserRepository userRepository;

    public List<DoctorEntity> findAll() {

        List<DoctorEntity> it = userRepository.findAll();

        ArrayList<DoctorEntity> users = new ArrayList<DoctorEntity>();
        it.forEach(e -> users.add(e));

        return users;
    }

    public Long count() {

        return userRepository.count();
    }

    public void deleteById(Long userId) {

        userRepository.deleteById(userId);
    }
}
