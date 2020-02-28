package rip.v2.junknamespace;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Router {

	@RequestMapping("/")
	public String index() {
		return "Hello World!";
	}

}
