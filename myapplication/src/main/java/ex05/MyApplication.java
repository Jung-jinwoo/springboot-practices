package ex05;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * 
 * Application Context 구성 후, 실행 할 코드(Application Context 환경)가 있는 경우
 * ApplicationRunner 인터페이스 구현 클랫스 빈 생성하기
 *
 */
@SpringBootApplication
public class MyApplication {
	
	@Bean
	public ApplicationRunner applicationRunner() {
		// 1. 작성된 구현 클래스를 사용하는 방법
		// return new HelloWorldRunner();
		
		// 2. Anonymous Class 사용하는 방법
//		return new ApplicationRunner() {
//			@Autowired
//			private MyComponent myComponent;
//
//			@Override
//			public void run(ApplicationArguments args) throws Exception {
//				myComponent.printHello();
//			}
//		};
		
		// 3. 함수형(람다 표현식)
		return (args) -> {
			System.out.println("HelloWorld");
		};
	}
	
	public static void main(String[] args) {
		try(ConfigurableApplicationContext c = SpringApplication.run(MyApplication.class, args)){
			
		}
	}
}
