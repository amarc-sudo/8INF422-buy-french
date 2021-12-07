package com.iut.james.controller;

import com.iut.james.beans.User;
import com.iut.james.services.UserService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.NoSuchAlgorithmException;
import java.util.Map;

@RestController
@RequestMapping("rest/api/user")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @CrossOrigin
    @PostMapping("login")
    @ApiOperation("Renvoie un professeur qui a le login et le mot de passe donnés en paramètre")
    public User readByLoginAndPassword(@RequestBody Map<String, String> mapInformations) throws NoSuchAlgorithmException {
        String login = mapInformations.get("email");
        String password = mapInformations.get("password");
        System.out.println(mapInformations.toString());
        return userService.login(login, password);
    }
}
