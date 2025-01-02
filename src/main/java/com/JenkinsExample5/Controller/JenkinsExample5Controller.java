package com.JenkinsExample5.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsExample5Controller {
@GetMapping(value="/getval")
public String get() {
	return "Hi sug";
}
}
