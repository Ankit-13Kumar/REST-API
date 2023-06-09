package com.springrest.springrest.services;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.springrest.springrest.services.CourseService;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;
	

	//List<Course> list;

	public CourseServiceImpl() {
		/*
		 * list=new ArrayList<>(); list.add(new Course (2012, "PHYSICS" ,
		 * "SOFTWARE DEVELOPER")); list.add(new
		 * Course(4543,"Chemistry","Backend Developer"));
		 * 
		 */
			
	}	

	@Override
	public List<Course> getCourses() {
		
		return courseDao.findAll();
		
		/* return list; */
	}

	
	
	@SuppressWarnings("deprecation")
	@Override
	public Course getCourse(long courseId) {
		/*
		 * Course c=null; 
		 * for(Course course: list)
		 *  { if(course.getId()== courseId) {
		 * c=course;
		 *  break; } }
		 */
		/* return c; */
		
		/* return courseDao.getOne(courseId); */
		return courseDao.getReferenceById(courseId);
	}
	
	
	@Override
	public Course addCourse(Course course) {
		/* list.add(course); */
		/* return course; */
		
		courseDao.save(course);
		return course;
	}
	

	@Override
	public Course updateCourse(Course course) {
		/*
		 * list.forEach(e ->{ if(e.getId()==course.getId()) {
		 * e.setTitle(course.getTitle()); e.setDescription(course.getDescription());
		 * }});
		 */
		/* return course; */
		
		courseDao.save(course);
		return course;
		
	}
	
	
	@Override
	public void deleteCourse(long parseLong) {
		//list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
	
		
		/*
		 * Course entity=courseDao.getOne(parseLong);
		 */		
		Course entity=courseDao.getReferenceById(parseLong);

		courseDao.delete(entity);
	
	}
	
	
	
}
