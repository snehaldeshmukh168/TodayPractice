package com.cjc.main.controller;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.main.model.Student;
import com.cjc.main.service.HomeService;

@Controller
public class HomeController 
{

	@Autowired
	HomeService hs;
	@RequestMapping("/")
	public String prelogin()
	{
		return "login";
	}
	@RequestMapping("/reg")
	public String preRegister()
	{
		return "register";
	}
	@RequestMapping("/registration")
	public String registerData(@ModelAttribute Student s)
	{
		hs.saveData(s);
		return "login";
	}
	  @RequestMapping("/log")
	    public String findData(@RequestParam("suname") String suname,@RequestParam("spass") String spass,Model m)
	    {
	    	Iterable<Student> li=hs.alldata();
	    	Iterator<Student> itr=li.iterator();
	    	while(itr.hasNext())
	    	{
	    		Student s=itr.next();
	    		System.out.println(s.getSid());
	    		System.out.println(s.getSname());
	    		System.out.println(s.getSaddr());
	    		System.out.println(s.getSpass());
	    		System.out.println(s.getSuname());
	    				
	    	}
	    	m.addAttribute("data",li);
	    	return "success";
	    }

}
