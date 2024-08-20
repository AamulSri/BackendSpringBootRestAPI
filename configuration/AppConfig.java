package com.ctrlcrafting.hello.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ctrlcrafting.hello.DB;
import com.ctrlcrafting.hello.DevDB;
import com.ctrlcrafting.hello.ProdDB;

@Configuration
public class AppConfig {

    @Bean("Prod")
    public DB getProdBean(){
        return new ProdDB();
    }

    @Bean("Dev")
    public DB getDevBean(){
        return new DevDB();
    }
    @Bean
    public ModelMapper gModelMapper(){
        return new ModelMapper();
    }
}
