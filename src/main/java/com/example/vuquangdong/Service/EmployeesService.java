package com.example.vuquangdong.Service;

import com.example.vuquangdong.Entity.EmployeesEntity;
import com.example.vuquangdong.Repository.EmployeesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeesService {
    @Autowired
    EmployeesRepo employeesrepo;

    public EmployeesEntity createEmployee(EmployeesEntity employees) {
        return employeesrepo.save(employees);
    }

    public List<EmployeesEntity> findAllEmployees(){
        return employeesrepo.findAll();
    };


}
