package com.in28mintues.learnspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		
		try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguartion.class)) //1.Launch a Spring Context
		{
			//2. Configure the things that you want Spring to manage 
			//HelloWorldConfiguration -- @configuration
			//name -- @Bean
			
			//3. Retrieving the bean manage by spring 
			System.out.println(context.getBean("name"));
			
			System.out.println(context.getBean("age"));
			
			System.out.println(context.getBean("person"));
			
			System.out.println(context.getBean("person2MethodCall"));
			
			System.out.println(context.getBean("person3Parameters"));
			
			System.out.println(context.getBean("address2"));
			
			System.out.println(context.getBean("address3",Address.class));
			
			System.out.println(context.getBean(Address.class));
			
//			String[] beanDefinitionNames = context.getBeanDefinitionNames();
//			System.out.println(Arrays.toString(beanDefinitionNames));
			
			//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println(context.getBean("person4Qualifier"));
		}
			
	}
}
