package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.DoctorEntity;

@Repository
public interface UserRepository extends JpaRepository<DoctorEntity, Integer> {
	
	Object findById(long valueOf);

	void deleteById(long valueOf);

	//DoctorEntity findByName(String name);

	
	
}
