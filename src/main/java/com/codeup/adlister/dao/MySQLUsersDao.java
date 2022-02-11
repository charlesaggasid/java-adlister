package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class MySQLUsersDao implements Users {
    private static Connection conn;

    public MySQLUsersDao(Config config) {
        if (conn == null) {
            try {
                DriverManager.registerDriver(new Driver());
                conn = DriverManager.getConnection(
                        config.getUrl(),
                        config.getUser(),
                        config.getPassword()
                );
            } catch (SQLException e) {
                throw new RuntimeException("Error connecting to the database!", e);
            }
        }
    }

    @Override
    public User findByUsername(String username) {
        User user = null;
//        List<User> users = new ArrayList<>();
        String sql = "SELECT * FROM users WHERE username = ?;";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                user = new User(rs.getLong("id"),
                rs.getString("username"),
                rs.getString("email"),
                rs.getString("password")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public Long insert(User user) {
        String queryString = "INSERT INTO users(username, email, password) VALUES (?, ?, ?);";
        try {
            PreparedStatement stmt = conn.prepareStatement(queryString, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            throw new RuntimeException("Error creating new user", throwables);
        }
    }

    public static void main(String[] args) {
        Users usersDao = new MySQLUsersDao(new Config());
        System.out.println(usersDao.findByUsername("john123"));
        // System.out.println(usersDao.findByUsername("fred123"));
//        User newUser = new User ("john123", "john123@email.com", "password");
//         usersDao.insert(newUser);
    }


}