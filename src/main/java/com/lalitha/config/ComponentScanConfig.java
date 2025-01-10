package com.lalitha.config;

import com.lalitha.util.ScannerInputService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
@ComponentScan(basePackages = "com.lalitha")

public class ComponentScanConfig {
    @Bean
    public Scanner scanner(){
        return new Scanner(System.in);
    }

    @Bean
    public ScannerInputService scannerInputService(){
        return new ScannerInputService(scanner());
    }
}
