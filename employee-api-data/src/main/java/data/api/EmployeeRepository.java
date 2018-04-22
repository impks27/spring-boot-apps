package data.api;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {

	List<Employee> findByName(@Param("name") String name);
	Employee findById(@Param("id") long id);

}