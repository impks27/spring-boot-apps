package data.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees(){
		List<Employee> employees = new ArrayList<>();		
		employeeRepository.findAll().forEach(employees::add);
		return employees;
	}
	
	public Employee getEmployee(long id) {
		return employeeRepository.findById(id);
	}
	
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	public void updateEmployee(Employee employee, String id) {
		employeeRepository.save(employee);
	}

	/*public void deleteEmployee(String id) {
		employeeRepository.delete(id);
	}	
*/
}
