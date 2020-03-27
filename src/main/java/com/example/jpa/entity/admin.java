package com.example.jpa.entity;

import javax.persistence.*;

//告诉JPA这是一个实体类（和数据库映射的类）
@Entity
//@Table来指定和哪个数据表对应
@Table(name = "admin")
public class admin {

    @Id //这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //主键自增
    private Integer id;

    @Column //和数据表对应的一列
    private String username;

    @Column
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
