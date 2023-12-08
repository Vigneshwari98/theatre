package org.jdbc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;

public class DatabaseConnection {
    static Logger logger = LogManager.getLogger();

    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/employee";
        String username = "root";
        String password = "Vigneshwari@30";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(url, username, password);

            statement = connection.createStatement();

            String query = "Select * from student";

            resultSet = statement.executeQuery(query);

            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                float gpa = resultSet.getFloat("gpa");
                System.out.println("Id: " + id + ", Name: " + name + ", GPA: " + gpa);
            }

            connection.close();
            statement.close();
            resultSet.close();
        }catch(ClassNotFoundException e){
            logger.error("ClassNotFoundException occurred", e);
        }catch (SQLException e){
            logger.error("SQLException occurred", e);
            logger.warn("Warning", e);
        }
    }
}

            // System.out.println("ClassNotFoundException");

            // System.out.println("SQLException");
