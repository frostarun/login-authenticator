package it.froststudio3e.rentoutdb.controller;

import it.froststudio3e.rentoutdb.model.ApiResponse;
import it.froststudio3e.rentoutdb.model.Users;
import it.froststudio3e.rentoutdb.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userService;

    @PostMapping
    public ApiResponse<Users> saveUser(@RequestBody Users user){
        return new ApiResponse<>(HttpStatus.OK.value(), "User saved successfully.",userService.save(user));
    }
//
//    @GetMapping
//    public ApiResponse<List<Users>> listUser(){
//        return new ApiResponse<>(HttpStatus.OK.value(), "User list fetched successfully.",userService.findAll());
//    }
//
//    @GetMapping("/{id}")
//    public ApiResponse<Users> getOne(@PathVariable int id){
//        return new ApiResponse<>(HttpStatus.OK.value(), "User fetched successfully.",userService.findById(id));
//    }
//
//    @PutMapping("/{id}")
//    public ApiResponse<UserDto> update(@RequestBody UserDto userDto) {
//        return new ApiResponse<>(HttpStatus.OK.value(), "User updated successfully.",userService.update(userDto));
//    }
//
//    @DeleteMapping("/{id}")
//    public ApiResponse<Void> delete(@PathVariable int id) {
//        userService.delete(id);
//        return new ApiResponse<>(HttpStatus.OK.value(), "User deleted successfully.", null);
//    }



}
