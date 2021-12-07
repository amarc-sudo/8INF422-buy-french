package com.iut.james.controller;

import com.iut.james.beans.Command;
import com.iut.james.beans.Product;
import com.iut.james.beans.User;
import com.iut.james.services.CommandService;
import com.iut.james.services.ProductService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("rest/api/Command")
@CrossOrigin("*")
@Slf4j
public class CommandController {

    @Autowired
    private CommandService productService;

    @PostMapping("getHistory")
    @ApiOperation("Renvoie un professeur qui a le login et le mot de passe donnés en paramètre")
    public List<Command> readByLoginAndPassword(@RequestBody User mapInformations) {
        return productService.getCommand(mapInformations);
    }
}
