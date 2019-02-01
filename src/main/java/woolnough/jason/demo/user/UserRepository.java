package woolnough.jason.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;

@Component
public class UserRepository {

    private final EntityManager entityManager;

    /**
     * This gross-looking constructor is just to hackishly populate a quick little in-memory DB
     */
    @Autowired
    public UserRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Customer> getCustomerByUsername(String username) {
        String sql = "SELECT * from customer where username = '" + username + "'";
        return entityManager.createNativeQuery(sql, Customer.class).getResultList();
    }

    public List<Customer> getCustomerByUsernameAndPassword(String username, String password) {
        String sql = "select c from Customer c where c.username like '" + username + "' and c.password like '" + password + "'";
        return entityManager.createQuery(sql, Customer.class).getResultList();
    }
}
