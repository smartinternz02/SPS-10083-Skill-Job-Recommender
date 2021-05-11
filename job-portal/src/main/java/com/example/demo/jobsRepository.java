package com.example.demo;


import org.springframework.data.jpa.repository.JpaRepository;

public interface jobsRepository extends JpaRepository<jobs, Integer>{
	java.util.List<jobs> findAll();
}