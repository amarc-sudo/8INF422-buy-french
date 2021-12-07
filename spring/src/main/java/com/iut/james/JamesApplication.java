package com.iut.james;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.NoSuchAlgorithmException;

@SpringBootApplication
@Slf4j
@EnableSwagger2
public class JamesApplication {

    public static void main(String[] args) {
        SpringApplication.run(JamesApplication.class, args);
        log.info("Lancement du serveur");
    }

}
