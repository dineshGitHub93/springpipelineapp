package net.codejava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.codejava.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer> {

}
