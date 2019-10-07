package com.lambdaschool.java_countries;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/population")

public class SizeController {
    @GetMapping(value = "/size/{people}", produces = {"application/json"})
    public ResponseEntity<?> countriesbyPop(@PathVariable long people) {
        ArrayList<Country> rtnCountries =
                JavaCountriesApplication.countryList.findCountries(c -> c.getMedianPop() >= people);
        rtnCountries.sort((c1, c2) -> c1.getCountryName().compareToIgnoreCase(c2.getCountryName()));
        return new ResponseEntity<>(rtnCountries, HttpStatus.OK);
    }

}
