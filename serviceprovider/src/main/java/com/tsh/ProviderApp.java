package com.tsh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = "com.tsh.serviceprovider")
public class ProviderApp
{
    public static void main( String[] args ) {
        SpringApplication.run(ProviderApp.class,args);
    }
}
