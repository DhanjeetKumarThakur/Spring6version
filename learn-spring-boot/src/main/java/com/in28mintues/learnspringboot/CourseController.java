package com.in28mintues.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@RequestMapping("/courses")
	public List<Course> retrieveAllCourse(){
		return Arrays.asList(
				new Course(1, "Learn AWS", "in28mintues"),
				new Course(2, "Learn DevOps", "in28mintues"),
				new Course(3,"Spring Boot","in28mintues")
				);
	}
}
