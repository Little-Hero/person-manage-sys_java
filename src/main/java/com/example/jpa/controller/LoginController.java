package com.example.jpa.controller;

import com.example.jpa.entity.admin;
import com.example.jpa.repository.adminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LoginController {

    @Autowired
//    adminService adminService;
    adminRepository adminRepository;

    @CrossOrigin
    @PostMapping("/login")
    @ResponseBody
    public Boolean Login(@RequestBody admin admin){
        System.out.println("用户名："+ admin.getUsername());
        System.out.println("密码："+admin.getPassword());
        admin = adminRepository.findByUserNameAndPwd(admin.getUsername(),admin.getPassword());
        if(admin != null){
            return true;
        }else {
            return false;
        }
    }


    @GetMapping("/findadmin")
    @ResponseBody
    public List<admin> findAll(){
        System.out.println("查询所有管理员");
        List<admin> adminList = adminRepository.findAll();

        return adminList;
    }

//    @GetMapping("/del")
//    @ResponseBody
//    public void delete(){
//        admin admin1=new admin();
//        admin1.setId(4);
//        adminRepository.delete(admin1);
//        System.out.println(admin1);
//    }
}
