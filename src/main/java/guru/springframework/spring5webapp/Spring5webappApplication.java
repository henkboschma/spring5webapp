package guru.springframework.spring5webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring5webappApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring5webappApplication.class, args);
	}

    public static class Foo {

        public String getBar(){
            return "Foobar";
        }

    }
}
