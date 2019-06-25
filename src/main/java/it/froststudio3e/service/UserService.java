package it.froststudio3e.service;

import it.froststudio3e.model.User;
import org.bson.types.ObjectId;

import java.util.List;

public interface UserService {

    User save(User user);

    List<User> findAll();

    void delete(ObjectId id);

    User findOne(String username);

    User findById(ObjectId id);
}
