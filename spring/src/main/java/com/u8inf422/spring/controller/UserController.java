package com.u8inf422.spring.controller;

import com.u8inf422.spring.beans.User;
import com.u8inf422.spring.services.UserService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.NoSuchAlgorithmException;
import java.util.Map;

@RestController
@RequestMapping("rest/api/user")
@CrossOrigin("*")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("login")
    @ApiOperation("Renvoie un professeur qui a le login et le mot de passe donnés en paramètre")
    public User readByLoginAndPassword(@RequestBody Map<String, String> mapInformations) throws NoSuchAlgorithmException {
        String login = mapInformations.get("email");
        String password = mapInformations.get("password");
        return userService.login(login, password);
    }
}
