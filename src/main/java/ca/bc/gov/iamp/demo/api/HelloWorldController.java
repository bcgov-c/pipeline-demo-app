package ca.bc.gov.iamp.demo.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1/hello")
public class HelloWorldController {


	private final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

	@GetMapping//(consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(code = HttpStatus.OK)
	public @ResponseBody String greetings() {
		logger.info("greetings");
		return "Hello World";
	}
}