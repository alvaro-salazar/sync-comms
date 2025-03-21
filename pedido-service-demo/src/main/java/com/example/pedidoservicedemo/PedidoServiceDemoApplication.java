package com.example.pedidoservicedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class PedidoServiceDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PedidoServiceDemoApplication.class, args);
    }

}
