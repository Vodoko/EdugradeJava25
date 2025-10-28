package se.gritacademy.excercisesSQLite;

import java.sql.*;

public class SelectStudents {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:students.db";
        String sql = "SELECT * FROM students";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("All students:");
            System.out.println("ID | Name | Age | Email");
            System.out.println("---+------+-----+-------");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String email = rs.getString("email");

                System.out.printf("%d | %s | %d | %s%n", id, name, age, email);
            }

        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}