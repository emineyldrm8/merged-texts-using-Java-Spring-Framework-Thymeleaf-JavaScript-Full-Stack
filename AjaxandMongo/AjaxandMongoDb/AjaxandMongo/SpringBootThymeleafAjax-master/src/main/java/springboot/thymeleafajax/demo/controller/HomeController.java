package springboot.thymeleafajax.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import springboot.thymeleafajax.demo.AjaxResponseBody;
import springboot.thymeleafajax.demo.UserForm;
import springboot.thymeleafajax.demo.model.User;
import springboot.thymeleafajax.demo.mongomodel.Texts;
import springboot.thymeleafajax.demo.mongorepo.TextsRepo;
import springboot.thymeleafajax.demo.service.UserService;

@Controller
@RequestMapping("/kullanici")
public class HomeController {
private UserService kullaniciService;
TextsRepo bookrepo;
@Autowired
public HomeController(TextsRepo bookrepo) {
	super();
	this.bookrepo = bookrepo;
}
	@Autowired
	public void setKullaniciService(UserService kullaniciService) {
		this.kullaniciService = kullaniciService;
	}
    @GetMapping("/")
    public String index() {
        return "index";
    }
 
    public List<User> KullaniciListesiDondur(@RequestBody UserForm userForm  )
	{ 
        AjaxResponseBody result = new AjaxResponseBody();
        UserForm user=new UserForm();
        
        List<User> userList = kullaniciService.getDataInUserForm(userForm);
      
    
		return userList;
		
	}
    

}