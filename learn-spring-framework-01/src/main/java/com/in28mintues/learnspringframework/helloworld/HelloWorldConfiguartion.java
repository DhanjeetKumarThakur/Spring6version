package com.in28mintues.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


//What is record keyword?
//In Java, the record keyword is used to declare a special class type that acts as a “data carrier” 
//i.e. model class or POJO class. This keyword is added to the Java language since JDK 14.
record Person(String name, int age, Address address2) {};

record Address(String street, String City) {};

@Configuration
public class HelloWorldConfiguartion {
	
	@Bean
	public String  name() {
		return "Ranga";
	}

	@Bean
	public int age() {
		return 15;
	}
	
	@Bean 
	public Person person() {
		return new Person("Ravi", 20, new Address("MAin Street", "UK"));
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address()); //here we are creating a new bean with help of existing beans
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address3) {
		return new Person(name, age, address3);
	}
	
	@Bean
	public Person person4Qualifier(String name, int age, @Qualifier("adress4Qualifier") Address address) {
		return new Person(name, age, address);
	}
	
	//You can give a custom name to beans
	@Bean(name="address2")
	public Address address() {
		return new Address("Baker Street", "London");
	}
	
	@Bean(name="address3")
	@Primary
	public Address address3() {
		return new Address("Motinagar", "Hyderabad");
	}
	
	@Bean
	@Qualifier("adress4Qualifier")
	public Address address4() {
		return new Address("Ringbasthi","Hyderabad");
	}
}
