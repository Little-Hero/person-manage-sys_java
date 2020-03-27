package com.example.jpa.controller;

import com.example.jpa.entity.Users;
import com.example.jpa.repository.UsersDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {
    @Autowired
    UsersDAO usersDAO;

    @CrossOrigin
    @GetMapping("/users")
    @ResponseBody
    public List<Users> findAll(){
        List<Users> usersList = usersDAO.findAll();
        return usersList;
    }

    @CrossOrigin
    @GetMapping("/dep/{department}")
    @ResponseBody
    public List<Users> findDepartment(@PathVariable("department")String department){
        System.out.println(department);
        List<Users> users1 = usersDAO.findByDepartment(department);
        System.out.println(users1);
        return users1;
    }

    @CrossOrigin
    @PostMapping("/add")
    @ResponseBody
    public void add(@RequestBody Users users){
        usersDAO.save(users);
        System.out.println(users);
    }

    @CrossOrigin
    @DeleteMapping("/del/{id}")
    public void delete(@PathVariable("id")Integer id){
        System.out.println(id);
        usersDAO.deleteById(id);
    }

    @CrossOrigin
    @GetMapping("/detail/{id}")
    @ResponseBody
    public Users detail(@PathVariable("id")Integer id){
        System.out.println(id);
        Users users=usersDAO.findByUserId(id);
        return users;
    }

    @CrossOrigin
    @PutMapping("/update")
    @ResponseBody
    public Users update(@RequestBody Users users){
        System.out.println(users.getName());
        Users users1=usersDAO.save(users);
        return users1;
    }
}
