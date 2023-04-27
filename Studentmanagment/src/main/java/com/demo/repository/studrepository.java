package com.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.Entity.Student;

@Repository
public interface studrepository extends JpaRepository<Student,Integer>
{

}