package com.example.ratingdataservice.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ratingdataservice.models.rating;

@RestController
@RequestMapping("/movierating")
public class RatingResource {
	@RequestMapping("/{movieId}")
	public rating getRating(@PathVariable("movieId") String movieid) {
		return new rating(movieid, 4);
	}

}
