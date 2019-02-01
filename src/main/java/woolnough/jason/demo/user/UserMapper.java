package woolnough.jason.demo.user;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;

public class UserMapper implements RowMapper<User> {

    /**
     * Try map a field, but don't panic if it's not there. This mapper is going to be used for fetching full and partial result sets.
     */
    @Override
    public User mapRow(ResultSet resultSet, int i) {
        User user = new User();
        try {
            user.setId(resultSet.getInt("id"));
        } catch (Exception e) {
            //do nothing
        }

        try {
            user.setName(resultSet.getString("name"));
        } catch (Exception e) {
            //do nothing
        }

        try {
            user.setSurname(resultSet.getString("surname"));
        } catch (Exception e) {
            //do nothing
        }

        try {
            user.setUsername(resultSet.getString("username"));
        } catch (Exception e) {
            //do nothing
        }

        try {
            user.setPassword(resultSet.getString("password"));
        } catch (Exception e) {
            //do nothing
        }
        return user;
    }
}
