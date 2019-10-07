package com.lambdaschool.java_countries;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AgeController {
    @GetMapping(value = "/min", produces = {"application/json"})
    public ResponseEntity<?> minAge() {

        ArrayList<Country> rtnCountries = JavaCountriesApplication.countryList.countryList;
        rtnCountries.sort((c1,c2) -> (int) c2.getMedianAge())
    }
}
