package com.javatechie.ratingsdataservice.controller;

import com.javatechie.ratingsdataservice.model.Rating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsData")
public class RatingDataController {

    @GetMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId){
        return new Rating(movieId,4.5);
    }

}
