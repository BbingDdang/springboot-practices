package com.poscodx.springboot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  1. 스프링 애플리케이션의 부트스트래핑 역할 : Bootstraping Class
 *  2. 설정클래스 : Configuration Class  
 */
@SpringBootApplication
public class HelloWorldApplication {
	public static void main(String[] args) {
		/*
		 * SpringApplication.run(...) 안에서 일어나는 일 : Bootstrap
		 * 1. 어플리케이션 컨텍스트(Application Context, Spring Container) 생성 
		 * 2. 만약 웹애플리케이션이면 웹애플리케이션 타입 결정(SpringMVC. Reactive)
		 * 3. 어노테이션 스캐닝 + Configuration Class를 통해서 빈 생성/등록/와이어링 주입
		 * 4. 만약 웹어플리케이션이고 타입이 Spring MVC이면 
		 * 	- 내장(embeded) 서버(TomcatEmbededServiceServletContainer) 인스턴스 생성
		 * 	- 서버 인스턴스에 웹애플리케이션을 배포
		 * 	- 서버 인스턴스 실행
		 * 5. ApplicationRunner Interface를 구현한 빈을 Application Context에서 찾아서 실 
		 */
//		// 원래는 이 코드 
//		ApplicationContext ac = null;
//		try {
//			 ac = SpringApplication.run(HelloWorldApplication.class, args);
//		}
//		catch(Throwable ex) {
//			
//		}
//		finally {
//			((ConfigurableApplicationContext) ac).close();
//		}
		// 이것도 된다. 
//		try(ConfigurableApplicationContext ac = SpringApplication.run(HelloWorldApplication.class, args)){
//		}
		SpringApplication.run(HelloWorldApplication.class, args);
	}
}
