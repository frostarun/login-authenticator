package it.froststudio3e.rentoutdb.repo;

import it.froststudio3e.rentoutdb.model.Users;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<Users, String> {
	Users findBy_id(ObjectId _id);

	Users findOne(String username);
}
