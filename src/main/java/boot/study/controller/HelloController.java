package boot.study.controller;


import boot.study.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @Autowired
    Person person;

    @RequestMapping("/person")
    public Person person(){
        return person;
    }
}
