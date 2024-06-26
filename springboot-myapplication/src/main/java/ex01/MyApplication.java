package ex01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration // Spring Test에서 ContextConfiguration을 안해도 됨.
public class MyApplication {
	@Bean
	public MyComponent myComponent() {
		return new MyComponent();
	}
	public static void main(String[] args) {
		try(ConfigurableApplicationContext ac = SpringApplication.run(MyApplication.class, args)){
			MyComponent myComponent = ac.getBean(MyComponent.class);
			System.out.println(myComponent);
		}
		
	}
}
