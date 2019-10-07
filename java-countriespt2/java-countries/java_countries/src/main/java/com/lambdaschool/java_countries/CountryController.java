package com.lambdaschool.java_countries;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/names")
public class CountryController {
    //localhost:8080/data/all
    @GetMapping(value = "/all",
                produces = {"application/json"})
    public ResponseEntity<?> getAllCountries() {
        JavaCountriesApplication.countryList.countryList.sort((c1, c2) -> c1.getCountryName().compareToIgnoreCase(c2.getCountryName()));
            return new ResponseEntity<>(JavaCountriesApplication.countryList.countryList, HttpStatus.OK);
    }

//    @GetMapping(value = "/{letter}", produces = {"application/json"})
//    public ResponseEntity<?> getCountryDetail(@PathVariable char letter) {
//
//    }
//    //localhost:8080/names/size/{number}
//    @GetMapping(value = "size/{number}", produces = {"application/json"})
//    public


}
