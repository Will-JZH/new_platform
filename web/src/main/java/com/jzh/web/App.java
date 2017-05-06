package com.jzh.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import com.jzh.dal.dao.config.MyBatisConfigurer;


@SpringBootApplication
@Import(MyBatisConfigurer.class)
@ImportResource({"spring/dal-context.xml"})
public class App 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class,args);
    }
}
