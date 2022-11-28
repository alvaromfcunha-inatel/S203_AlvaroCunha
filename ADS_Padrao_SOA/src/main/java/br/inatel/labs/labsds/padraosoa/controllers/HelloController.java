package br.inatel.labs.labsds.padraosoa.controllers;

import br.inatel.labs.labsds.padraosoa.MyMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping
    public MyMessage getHello() {
        MyMessage msg = new MyMessage();
        msg.setInfo("Salve SOA!");
        return msg;
    }
}
