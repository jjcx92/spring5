package guru.springframework.spring5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring5Application {

	public static void main(String[] args) {


		try {
			SpringApplication.run(Spring5Application.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
