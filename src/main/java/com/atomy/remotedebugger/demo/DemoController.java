package com.atomy.remotedebugger.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController {

	@GetMapping("/greeting")
	public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		int x = 1;
		int y = 2;
		int z = name.length();
		return String.format("Hello %s, %i", name, x+y+z);
	}
}
