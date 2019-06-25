package it.froststudio3e.controller;

import it.froststudio3e.model.User;
import it.froststudio3e.model.UserDto;
import it.froststudio3e.service.UserService;
import org.bson.types.ObjectId;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private ModelMapper modelMapper;

    //@Secured({"ROLE_ADMIN", "ROLE_USER"})
    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> listUser() {
        return userService.findAll();
    }

    //@Secured("ROLE_USER")
    @PreAuthorize("hasRole('USER')")
    ////@PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    public User getOne(@PathVariable(value = "id") ObjectId id) {
        return userService.findById(id);
    }


    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public UserDto saveUser(@RequestBody UserDto user) {
        return userService.save(modelMapper.map(user, User.class));
    }


}
