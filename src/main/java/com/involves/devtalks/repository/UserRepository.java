package com.involves.devtalks.repository;

import com.involves.devtalks.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
