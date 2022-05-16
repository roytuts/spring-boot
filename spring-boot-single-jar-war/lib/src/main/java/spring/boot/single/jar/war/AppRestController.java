package spring.boot.single.jar.war;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRestController {

	@GetMapping("/")
	public ResponseEntity<String> msg() {
		return new ResponseEntity<String>("Welcome to REST API", HttpStatus.OK);
	}

}
