package com.example.vuquangdong.Repository;

import com.example.vuquangdong.Entity.EmployeesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeesRepo extends JpaRepository<EmployeesEntity,Integer> {
}
