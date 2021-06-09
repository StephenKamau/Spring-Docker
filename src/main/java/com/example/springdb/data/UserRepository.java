package com.example.springdb.data;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {

}
