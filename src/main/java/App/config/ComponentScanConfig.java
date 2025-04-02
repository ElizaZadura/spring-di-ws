package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
@ComponentScan(basePackages = {"data_access", "util"}) // Ensure both packages are scanned
public class ComponentScanConfig {
    @Bean
    public Scanner scanner() {
        return new Scanner(System.in);
    }
}
