package com.demo.studentController;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Entity.Student;


import com.demo.repository.studrepository;


@CrossOrigin(origins="http://localhost:4200")
@RestController
public class studcontroller
{

	@Autowired
	private studrepository srepository;  


	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/insertrecord")
	public Student insertrecord(@RequestBody Student c1)                    // insert service
	{
		return srepository.save(c1);

	}
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/updaterecord")
	public Student updaterecord(@RequestBody Student  c1)                    // update service
	{
		return srepository.save(c1);

	}

	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/deleterecord")
	public void deleterecord(@RequestBody Student  c1)                    // update service
	{
		srepository.delete(c1);

	}

	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/viewrecord")
	public List<Student > viewrecord()
	{
		return srepository.findAll();
	}

}
	

	

