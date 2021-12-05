package com.tpam.inviteme.controller;

import com.tpam.inviteme.services.TokenConnexionService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("rest/api/token")
@CrossOrigin("*")
@Slf4j
public class TokenConnexionController {

    @Autowired
    private TokenConnexionService tokenConnexionService;

    @GetMapping("checkConnexion")
    @ApiOperation(value = "Vérifie que le token et l'adresse mail passé en paramètre sont valides par rapport à la date d'expiration")
    public Boolean checkConnexion(@RequestParam String mail, @RequestParam String token) {
        return tokenConnexionService.checkConnexion(mail, token);
    }

}
