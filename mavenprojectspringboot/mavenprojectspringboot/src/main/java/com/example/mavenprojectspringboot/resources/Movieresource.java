package com.example.mavenprojectspringboot.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mavenprojectspringboot.models.movie;

@RestController
@RequestMapping("/movie")
public class Movieresource {
	@RequestMapping("/{movieid}")
	public movie gertInfo(@PathVariable("movieid") String movieid) {
		return new movie(movieid, "Hello");
	}

}
