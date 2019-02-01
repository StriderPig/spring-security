package woolnough.jason.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<Customer> getCustomer(String username) {
        return userRepository.getCustomerByUsername(username);
    }

    public List<Customer> getCustomer(String username, String password) {
        return userRepository.getCustomerByUsernameAndPassword(username, password);
    }
}
