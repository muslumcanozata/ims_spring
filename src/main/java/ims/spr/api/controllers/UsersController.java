package ims.spr.api.controllers;


import ims.spr.business.abstracts.UserService;
import ims.spr.core.utilities.results.DataResult;
import ims.spr.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UsersController {
    private UserService userService;

    public UsersController(){
        super();
    }

    @Autowired
    public UsersController(UserService userService) {
        super();
        this.userService = userService;
    }

    @GetMapping("/getAll")
    public DataResult<List<User>> getAll() {
        return this.userService.getAll();
    }

    @GetMapping("/getByIsno")
    public DataResult<User> getByIsno(@RequestParam long isno) {
        return this.userService.getByIsno(isno);
    }
}
