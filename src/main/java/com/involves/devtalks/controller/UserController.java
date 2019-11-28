package com.involves.devtalks.controller;

import com.involves.devtalks.contract.UserContract;
import com.involves.devtalks.service.UserService;
import com.involves.devtalks.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public List<UserContract> findAll() {
        List<User> users = service.findAll();
        return users.stream()
                .map(UserContract::new)
                .collect(Collectors.toList());
    }

   @PostMapping
   public UserContract save(@RequestBody @Valid UserContract contract) {
        User userToSave = contract.toDomain();
        User userDb = service.save(userToSave);
        return new UserContract(userDb);
   }
}
