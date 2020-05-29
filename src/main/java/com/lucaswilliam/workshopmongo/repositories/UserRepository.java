package com.lucaswilliam.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.lucaswilliam.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
