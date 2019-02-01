package woolnough.jason.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/username")
    public List<Customer> getCustomer(@RequestParam("username") String username) {
        return userService.getCustomer(username);
    }

    @GetMapping("/usernamepassword")
    public List<Customer> getCustomer(@RequestParam("username") String username, @RequestParam("password") String password) {
        return userService.getCustomer(username, password);
    }
}
