package com.mashtykov.springbootlast.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    //@Query("select e from Employee e where e.email = ?1")
    Optional<Employee> findByEmail (String email);
    Optional<Employee> findById(Long id);
    void deleteById(Long id);
}
