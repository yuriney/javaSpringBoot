package io.github.yuriney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@ComponentScan(basePackages = {"io.github.yuriney.repository","io.github.yuriney"})
//using the component scan the springboot will only scan what you choose but if you dont specify it'll scan everything
@RestController
public class VendasApplication {

    /*@Autowired
    @Qualifier("applicationName")*/

    @Value("${application.name}")
    private String applicationName;
    @GetMapping("/abc")

    public String helloWorld(){
        return applicationName;
    }

    public static void main(String[] args) {

        SpringApplication.run(VendasApplication.class, args);
    }
}
