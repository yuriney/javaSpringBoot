package io.github.yuriney;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
@Profile("development")
public class MyConfiguration {


    //ao iniciar o programa spring ele procura executar todos os programas com @bean com CommandLineRunner
    @Bean
    public CommandLineRunner executar(){
        return args -> {
            System.out.println("RODANDO A CONFIGURAÇÃO DE DESENVOLVIMENTO");
        };

    }


    /*@Bean(name = "applicationName")
    public String applicationName(){
        return "sistema de vendas";
    }*/
}
