package com.jwtsecurity.crudsecurity.contriller;
import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RestController;


import com.jwtsecurity.crudsecurity.bean.Subject;
import com.jwtsecurity.crudsecurity.service.SubjectService;

    
	@RestController
	public class SubjectController {
		@Autowired
		private SubjectService subjectService; 

//		@PreAuthorize("haseRole('ADMIN')")
//		@PostMapping("/students")
//		public Student createStudent(@RequestBody Student student) {
//			
//			students.add(student);
//			return student;
		
		
		@RequestMapping("/subjects")
		public List<Subject>getAllSubjects(){
			return subjectService.getAllSubjects();
		}
		
//		@PreAuthorize("haseRole('ADMIN')")
		@RequestMapping(method=RequestMethod.POST,value="/subjects")
		public void addSubject(@RequestBody Subject subject) {
		
			subjectService.addSubject(subject);
		}
		@RequestMapping(method=RequestMethod.PUT,value="/subjects/{id}")
		public void updateSubject(@PathVariable String id, @RequestBody Subject subject) {
		
			subjectService.updateSubject(id, subject);
		}
		@RequestMapping(method=RequestMethod.DELETE,value="/subjects/{id}")
		public void deleteSubject(@PathVariable String id) {
			subjectService.deleteSubject(id);
		}

	}


