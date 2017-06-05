package io.louisleung.starter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonFormat;

@RestController
public class HelloController {
	@RequestMapping("")
	@JsonFormat(pattern="yyyy-MM-dd")
	public Date getTime() {
		DateFormat dF = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		return date;
	}
	
	@RequestMapping("/hello")
	public String helloWorld() {
		return "Hello World";
	}
}
