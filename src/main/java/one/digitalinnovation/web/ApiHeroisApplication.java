package one.digitalinnovation.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;

@SpringBootApplication
@EnableDynamoDBRepositories
public class ApiHeroisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiHeroisApplication.class, args);
	}

}
