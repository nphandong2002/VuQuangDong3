package com.example.vuquangdong.Entity;

import javax.persistence.*;

@Entity
@Table(name = "employees")

public class EmployeesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "name", nullable = false, length = 250)
    private String name;
    @Column(name = "wage", nullable = false, length = 10)
    private int wage ;


    public  EmployeesEntity(){

    }
    public  EmployeesEntity(String name, int wage){
        this.name = name;
        this.wage = wage;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }
}
