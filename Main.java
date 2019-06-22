package com.conditional;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CConfig.class);
	ListService listService = context.getBean(ListService.class);
	System.out.println(context.getEnvironment().getProperty("os.name") + " the system's list command is: " + listService.showListCmd());
context.close();}
}
