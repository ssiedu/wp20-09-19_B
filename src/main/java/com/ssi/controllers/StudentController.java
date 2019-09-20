package com.ssi.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssi.entities.Student;

@Controller
public class StudentController {
	@RequestMapping("newstudent")
	public ModelAndView showDataEntryForm(){
		Student student=new Student();
		ModelAndView mv=new ModelAndView("dataentry");
		mv.addObject("student",student);
		return mv;
	}
	
	@RequestMapping("savestudent")
	public ModelAndView saveStudentData(@Valid @ModelAttribute("student") Student student, BindingResult result){
		
		if(result.hasErrors()){
			ModelAndView mv=new ModelAndView("dataentry");
			return mv;
			
		}
		
		//saving data
		ModelAndView mv=new ModelAndView("success");
		return mv;
		
	}
}
