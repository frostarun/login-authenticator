package it.froststudio3e.rentoutdb.repo;

import it.froststudio3e.rentoutdb.model.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<Users, String> {

	Users findByUsername(String username);
}
