package com.rapp.springlearn.controller;

import com.rapp.springlearn.model.Employee;
import com.rapp.springlearn.model.User;
import com.rapp.springlearn.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {
    @Qualifier("employeeServiceImpl")
    @Autowired
    EmployeeService employeService;
    @RequestMapping("/")
    public String getHome() {
        return "Hello Spring boot application";
    }

   // @RequestMapping(value = "/user", method = RequestMethod.POST)
    @GetMapping("/user")
    public User user(){
        User user = new User();
        user.setId("1");
        user.setName("Rajesh");
        user.setEmailId("raju.bhatiya@gmail.com");

        return user;
    }
    @GetMapping("/user/{id}/{id2}")
    public String getUser(@PathVariable String id, @PathVariable("id2") String name){
        User user = new User();
        user.setId("1");
        user.setName("Rajesh");
        user.setEmailId("raju.bhatiya@gmail.com");

        return "Value of path variable id is "+id+" and id2 is : "+name;
    }
    @GetMapping("/requestparam")
    public String requestParam(@RequestParam(required = false, defaultValue = "Raj") String name,@RequestParam String email){

        return "This is request param name is "+name +" and email id is : "+email;
    }
@PostMapping()
    public Employee save(@RequestBody Employee employee){
        return employeService.save(employee);
    }
}
