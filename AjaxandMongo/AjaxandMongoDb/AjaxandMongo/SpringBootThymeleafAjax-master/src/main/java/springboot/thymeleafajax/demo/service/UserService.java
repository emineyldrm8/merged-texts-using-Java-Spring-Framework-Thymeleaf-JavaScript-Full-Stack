package springboot.thymeleafajax.demo.service;

import org.springframework.stereotype.Service;
import springboot.thymeleafajax.demo.UserForm;
import springboot.thymeleafajax.demo.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    private List<User> users;

    public List<User> getDataInUserForm(UserForm userForm) {

        User user = new User(userForm.getEnterednumber(),userForm.getAllTexts());

        return new ArrayList<User>(Arrays.asList(user));

    }

}
