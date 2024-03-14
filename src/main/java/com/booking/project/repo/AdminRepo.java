package com.booking.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.booking.project.model.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer>{

}
