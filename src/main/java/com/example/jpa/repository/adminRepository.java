package com.example.jpa.repository;

import com.example.jpa.entity.admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

//继承JpaRepository来完成对数据库的操作
public interface adminRepository extends JpaRepository<admin,Integer> {
@Query(value = "select * from admin where username = ?1 and password = ?2",nativeQuery = true)
admin findByUserNameAndPwd(String username,String password);
}
