package hello.itemservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ItemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemServiceApplication.class, args);
	}

	/*
	* 스프링에서 제공하는 메세지 관리 기능을 사용하려면 messageSource 를 스프링 빈으로 등록해야 한다.
	* MessageSource 는 인터페이스 이기 때문에, 구현체인 ResourceBundleMessageSource 를 스프링 빈으로 등록하자.
	* */
//	@Bean
//	public MessageSource messageSource() {
//		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
//		messageSource.setBasenames("messages", "errors");
//		messageSource.setDefaultEncoding("utf-8");
//		return messageSource;
//	}

	// 하지만 스프링 부트를 사용하면 스프링 부트가 MessageSource 가 자동으로 스프링 빈으로 등록한다.
}
