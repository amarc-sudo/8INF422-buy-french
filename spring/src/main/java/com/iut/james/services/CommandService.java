package com.iut.james.services;

import com.iut.james.beans.Command;
import com.iut.james.beans.User;
import com.iut.james.dao.CommandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service("commandService")
@Transactional
public class CommandService {

    @Autowired
    private CommandRepository commandRepository;

    public List<Command> getCommand(User mapInformations){

        List<Command>products=commandRepository.findAllByIdUserOrderByDate(mapInformations);
        System.out.println(products);
        return commandRepository.findAllByIdUserOrderByDate(mapInformations);
    }

    public List<Command> getAllCommand() {
        List<Command>products=commandRepository.findAll();
        System.out.println(products.toString());
        return products;
    }
}
