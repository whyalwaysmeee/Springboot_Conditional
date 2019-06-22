package com.conditional;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
@Configuration
public class CConfig {
@Bean
@Conditional(Windows.class)
public ListService windowLS() {
	return new WindowsLS();
}

@Bean
@Conditional(Linux.class)
public ListService linuxLS() {
	return new LinuxLS();
}
}
