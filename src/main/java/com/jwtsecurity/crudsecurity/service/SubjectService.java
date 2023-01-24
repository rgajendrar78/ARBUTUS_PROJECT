package com.jwtsecurity.crudsecurity.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jwtsecurity.crudsecurity.bean.Subject;
import com.jwtsecurity.crudsecurity.repository.SubjectRepository;


@Service
public class SubjectService {

	@Autowired
	public SubjectRepository SubjectRepo;
	
	public List<Subject> getAllSubjects()
	{
		List<Subject> subjects =new ArrayList<>();
		SubjectRepo.findAll().forEach(subjects::add);
		return subjects;
		
	}

	public void addSubject(Subject subject) {
		SubjectRepo.save(subject);
		
	}

	public void updateSubject(String id, Subject subject) {
		SubjectRepo.save(subject);
		
	}

	public void deleteSubject(String id) {
		SubjectRepo.deleteById(id);
		
	}
	
}