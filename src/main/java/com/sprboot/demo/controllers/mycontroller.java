package com.sprboot.demo.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sprboot.demo.entities.Movie;

@RestController
public class mycontroller {
	@DeleteMapping("/delbyid/{mid}")
	public String deletebyid(@PathVariable("mid") int id) {
		String endpoint="http://localhost:8080/movies/"+id;
		RestTemplate rt=new RestTemplate();
		rt.delete(endpoint);
		return "Deleted successfully";
	}
	@GetMapping("/getbyid/{mid}")
	public Movie getbyid(@PathVariable("mid") int id) {
		String endpoint="http://localhost:8080/movies/"+id;
		RestTemplate rt=new RestTemplate();
		Movie m=rt.getForObject(endpoint,Movie.class);
		return m;
	}
	@GetMapping("/getall")
	public List<Movie> getall() {
		String endpoint="http://localhost:8080/movies/";        // URL for SpringBootProject-1
		RestTemplate rt=new RestTemplate();			// rt - RestTemplate object
		List<Movie> m=Arrays.asList(rt.getForObject(endpoint,Movie[].class)); // getForObject() containing endpoint associated with Entity Class Movie
		return m;
	}
	@GetMapping("/getbygenre/{mgenre}")
	public List<Movie> getbygenre(@PathVariable("mgenre") String mgenre) {
		String endpoint="http://localhost:8080/movies/genre/"+mgenre;
		RestTemplate rt=new RestTemplate();
		List<Movie> m=Arrays.asList(rt.getForObject(endpoint,Movie[].class));
		return m;
	}
	@PutMapping("/update")
	public String updmovie(@RequestBody Movie m) {
		String endpoint="http://localhost:8080/movies/";
		RestTemplate rt=new RestTemplate();
		rt.put(endpoint,m);
		return "updated successfully";
	}
	@PostMapping("/add")
	public String addmovie(@RequestBody Movie m) {
		String endpoint="http://localhost:8080/movies/";
		RestTemplate rt=new RestTemplate();
		rt.postForLocation(endpoint, m);
		return "added successfully";
	}
}
