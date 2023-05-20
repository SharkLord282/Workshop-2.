package org.example;

import org.mindrot.jbcrypt.BCrypt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    private static final String CREATE_USER_QERY = "INSERT INTO users(username, email, password) VALUES (?, ?, ?)";

    public User create(User user) throws SQLException {
        Connection conn = DbUtil.getConnection();
        PreparedStatement statement = conn.prepareStatement(CREATE_USER_QERY,PreparedStatement.RETURN_GENERATED_KEYS);
        statement.setString(1, user.getUserName());
        statement.setString(2,user.getEmail());
        statement.setString(3,hashPassword(user.getPassword()));
        statement.executeUpdate();
        ResultSet resultSet = statement.getGeneratedKeys();
        if (resultSet.next()) {
            user.setId(resultSet.getInt(1));
        }
        return user;
    }

    public String hashPassword(String passwor) {
        return BCrypt.hashpw(passwor, BCrypt.gensalt());
    }


}

