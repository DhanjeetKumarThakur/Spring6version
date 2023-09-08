package com.in28mintues.springboot.myfirstwebappusingspringboot3.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

	@ResponseBody
	@RequestMapping("/say-hello")
	public String sayHello() {
		return "Hello ! what are you lerning today?";
	}
	
	@RequestMapping("/say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> My First HTML Page -Changed </title> ");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("<h1> My html Page with body -changed </h1>");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
	}
	
	//Now on we will be working with .jsp files for view(UI)
	//
	// "say-hello-jsp" => sayHello.jsp 
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/welcome.jsp
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/login.jsp
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/todos.jsp
	@RequestMapping("/say-hello-jsp")
	public String sayHellojsp() {
		return "sayHello";
	}
}
