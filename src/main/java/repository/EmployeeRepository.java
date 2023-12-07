package repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.Employee;



@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}