package com.groupwork.dashboard;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findUserById(Integer id);
}