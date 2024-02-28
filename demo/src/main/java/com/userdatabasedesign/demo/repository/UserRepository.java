package com.userdatabasedesign.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;


import com.userdatabasedesign.demo.entity.User;
public interface UserRepository extends JpaRepository<User, Long>{

}
