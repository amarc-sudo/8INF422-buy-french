package com.iut.james.controller;

import com.iut.james.beans.Command;
import com.iut.james.beans.User;
import com.iut.james.services.CommandService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rest/api/Command")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@Slf4j
public class CommandController {

    @Autowired
    private CommandService productService;

    @CrossOrigin
    @PostMapping("getHistory")
    @ApiOperation("Renvoie un professeur qui a le login et le mot de passe donnés en paramètre")
    public List<Command> readByLoginAndPassword(@RequestBody User mapInformations) {
        System.out.println(mapInformations.toString());
        return productService.getCommand(mapInformations);
    }

    @GetMapping("getall")
    @ApiOperation("Renvoie un professeur qui a le login et le mot de passe donnés en paramètre")
    public List<Command> getall() {
        return productService.getAllCommand();
    }
}
