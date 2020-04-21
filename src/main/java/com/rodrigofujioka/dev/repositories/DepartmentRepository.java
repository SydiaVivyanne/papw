package com.rodrigofujioka.dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rodrigofujioka.dev.domain.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
