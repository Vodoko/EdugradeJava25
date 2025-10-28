package se.gritacademy.excercisesSQLite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertMoreStudents {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:students.db";
        String sql = "INSERT INTO students (name, age, email) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // Student 3
            pstmt.setString(1, "Helge Helgeson");
            pstmt.setInt(2, 55);
            pstmt.setString(3, "helge@example.com");
            pstmt.executeUpdate();

            // Student 4
            pstmt.setString(1, "Robert Robertsson");
            pstmt.setInt(2, 100);
            pstmt.setString(3, "Robert@example.com");
            pstmt.executeUpdate();

            pstmt.setString(1, "Hej Hejsson");
            pstmt.setInt(2, 35);
            pstmt.setString(3, "Hej@example.com");
            pstmt.executeUpdate();

            System.out.println("Students inserted successfully!");

        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}