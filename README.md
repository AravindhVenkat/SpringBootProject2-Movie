# SpringBootProjectClientSide-Movie
Movie based Spring Boot project made on Spring Tool Suite 4 (STS 4)

***SpringBootProject2-Movie - GETS/PUTS/POSTS/DELETES from SpringBootProject1-ServerSide-Movie***

Run using - http://localhost:8083/getall

### Specifications
Created **Spring Starter Project** with **dependencies** auto-generated on **pom.xml** for the following:
1) **Spring Web Services**
2) **Spring Web**

***localhost*** server from PostgreSQL & pgAdmin4

***Apache Tomcat*** - Port **8083** - Configuration on application.properties = server.port=8083

***Postman API*** tool used for **GET PUT POST DELETE** by using **@GetMapping, @PutMapping, @PostMapping, @DeleteMapping** etc

### Java Packages:
1) Controller – mycontroller.java - @RestController 
2) Entities – Movie Class implements Serializable

In mycontroller.java, the RestController class, only the path for method-calling is set = /method2/

for example - @GetMapping("/getall")
and a String variable 'endpoint' containing the path of SpringBootProject1-ServerSide-Movie is used inside an instantiated **RestTemplate** object and then **getForObject()** is performed

@GetMapping("/getall")
public List<Movie> getall()
  {
	  String endpoint="http://localhost:8080/movies/";                      //SpringBootProject-1 URL
	  RestTemplate rt=new RestTemplate();                                   //rt - RestTemplate object
	  List<Movie> m=Arrays.asList(rt.getForObject(endpoint,Movie[].class)); // getForObject() containing endpoint associated with Entity class Movie
	  return m;
  }
  
