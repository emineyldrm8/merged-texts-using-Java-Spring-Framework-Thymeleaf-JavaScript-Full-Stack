package springboot.thymeleafajax.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestBody;

import springboot.thymeleafajax.demo.controller.HomeRestController;
import springboot.thymeleafajax.demo.model.User;
import springboot.thymeleafajax.demo.mongomodel.Texts;
import springboot.thymeleafajax.demo.mongorepo.TextsRepo;

@SpringBootApplication
public class DemoApplication{
	
	TextsRepo bookrepo;
    @Autowired
	public DemoApplication(TextsRepo bookrepo) {
		super();
		this.bookrepo = bookrepo;
	}
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        
    }
	

}
