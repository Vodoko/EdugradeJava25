package se.gritacademy.excercisesSQLite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertStudent {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:students.db";
        String sql = "INSERT INTO students (name, age, email) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // Student 1
            pstmt.setString(1, "Alice Johnson");
            pstmt.setInt(2, 22);
            pstmt.setString(3, "alice@example.com");
            pstmt.executeUpdate();

            // Student 2
            pstmt.setString(1, "Bob Smith");
            pstmt.setInt(2, 24);
            pstmt.setString(3, "bob@example.com");
            pstmt.executeUpdate();

            System.out.println("Students inserted successfully!");

        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}