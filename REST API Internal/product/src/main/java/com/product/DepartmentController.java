package com.product;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.val;

import java.util.List;

//import javax.validation.Valid;
@RestController
public class DepartmentController {
	@Autowired
	   private DepartmentService departmentService;

	    @PostMapping("/departments")
	    
	    public Department saveDepartment(
	        @val @RequestBody Department department)
	    {
	        return departmentService.saveDepartment(department);
	    }
	  @GetMapping("/departments")
	  
	    public List<Department> fetchDepartmentList()
	    {
	        return departmentService.fetchDepartmentList();
	    }  
	  
	  @PutMapping("/departments/{id}")
	  
	    public Department
	    updateDepartment(@RequestBody Department department,
	                     @PathVariable("id") Long departmentId)
	    {
	        return departmentService.updateDepartment(
	            department, departmentId);
	    }
	  
	  @DeleteMapping("/departments/{id}")
	  
	    public String deleteDepartmentById(@PathVariable("id")
	                                       Long departmentId)
	    {
	        departmentService.deleteDepartmentById(
	            departmentId);
	        return "Deleted Successfully";
	    }
	public DepartmentController() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
