package se.inyat.config;

import java.beans.BeanProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


import java.util.Scanner;

@Configuration
@ComponentScan(basePackages = "se.inyat")

public class ComponentScanConfig {

        @Bean
        public Scanner scanner() {
            return new Scanner(System.in);
        }
}
