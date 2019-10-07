package com.lambdaschool.java_countries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaCountriesApplication {

    static CountryList countryList;

    public static void main(String[] args) {
        SpringApplication.run(JavaCountriesApplication.class, args);
            countryList = new CountryList();
    }


}
