package com.RFQ.RFQSystem.repo;
/**
 * @author Fuhad Ali
 *
 */
import org.springframework.data.jpa.repository.JpaRepository;

import com.RFQ.RFQSystem.model.Employee;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
    
   
}
