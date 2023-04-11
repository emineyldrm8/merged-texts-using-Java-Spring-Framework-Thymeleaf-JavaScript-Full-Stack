package springboot.thymeleafajax.demo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import springboot.thymeleafajax.demo.mongomodel.Texts;
import springboot.thymeleafajax.demo.mongorepo.TextsRepo;

@Controller
public class TextController {
	@Autowired
	private TextsRepo repo;
	


}


