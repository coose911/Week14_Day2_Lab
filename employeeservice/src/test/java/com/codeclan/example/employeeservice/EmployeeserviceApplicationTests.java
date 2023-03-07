package com.codeclan.example.employeeservice;

import com.codeclan.example.employeeservice.models.Assignment;
import com.codeclan.example.employeeservice.models.Department;
import com.codeclan.example.employeeservice.models.Employee;
import com.codeclan.example.employeeservice.models.Project;
import com.codeclan.example.employeeservice.repositories.AssignmentRepository;
import com.codeclan.example.employeeservice.repositories.DepartmentRepository;
import com.codeclan.example.employeeservice.repositories.EmployeeRepository;
import com.codeclan.example.employeeservice.repositories.ProjectRepository;
import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeserviceApplicationTests {

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Autowired
	AssignmentRepository assignmentRepository;

	@Test
	void contextLoads() {
	}
	@Test
	public void createEmployee(){
		assignmentRepository.deleteAll();
		employeeRepository.deleteAll();
		projectRepository.deleteAll();
		departmentRepository.deleteAll();


		Department department = new Department("Department of Justice");
		departmentRepository.save(department);

		Employee employee1 = new Employee("Johnny Sweden", 37, 69, "johnnysweden69@yahoo.com", department);
		employeeRepository.save(employee1);

		Employee employee2 = new Employee("Vinnie Jones", 58, 108, "oldvinnie@redcard.com", department);
		employeeRepository.save(employee2);

		Project project1 = new Project("Vindication", 14);
		projectRepository.save(project1);

		Project project2 = new Project("Pottery", 7);
		projectRepository.save(project2);

		Assignment assignment1 = new Assignment(employee2, project1);
		assignmentRepository.save(assignment1);

		Assignment assignment2 = new Assignment(employee1, project2);
		assignmentRepository.save(assignment2);
	}

}
