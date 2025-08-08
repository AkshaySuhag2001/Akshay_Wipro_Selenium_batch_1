package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.Statement;

public class DatabaseConnect {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Wipro", "root", "Akshay@2001");

			System.out.println("Connected Successfully");
			
			//Statement stmt = con.createStatement();
			
			/*String sql = "CREATE TABLE IF NOT EXISTS patients (" +
                    "id INT PRIMARY KEY, " +
                    "name VARCHAR(100), " +
                    "disease VARCHAR(100), " +
                    "age INT)";*/
			
			//Insert data
			/*String insertData = "INSERT INTO patients(id, name, disease, age) VALUES(?,?,?,?)";
			PreparedStatement psmt = con.prepareStatement(insertData);
			
			psmt.setInt(1, 1);
			psmt.setString(2, "Akshay");
			psmt.setString(3, "Fever");
			psmt.setInt(4, 23);
			
			int rowsInserted = psmt.executeUpdate();
			if (rowsInserted > 0) {
                System.out.println("Patient record inserted successfully.");
            }
			psmt.close();*/
			
			//insert using array
			/*String insertData = "INSERT INTO patients(id, name, disease, age) VALUES(?,?,?,?)";
			PreparedStatement psmt = con.prepareStatement(insertData);
			String[][] arrayData = {
					{"2", "Ajay", "Fever", "23"},
					{"3", "Rahul", "Cold", "26"}
			};
			for (String[] p : arrayData) {
                psmt.setInt(1, Integer.parseInt(p[0]));
                psmt.setString(2, p[1]);
                psmt.setString(3, p[2]);
                psmt.setInt(4, Integer.parseInt(p[3]));
                psmt.executeUpdate();
            }
			System.out.println("All patients Added");
			psmt.close();*/
			
			//Update data
			/*String updateData = "UPDATE patients SET name = ? WHERE name = ?";
			PreparedStatement psmt = con.prepareStatement(updateData);
			psmt.setString(1, "Gojo");
			psmt.setString(2, "Ajay");
			int rows = psmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Patient record updated successfully.");
            } else {
                System.out.println("Patient ID not found.");
            }
            psmt.close();*/
			
			//update multiple data
			String updateData = "UPDATE patients SET name = ? WHERE name = ?";
            PreparedStatement psmt = con.prepareStatement(updateData);

            // Step 4: Define multiple updates using array
            String[][] updates = {
                {"Ajay", "Geto"},
                {"Rahul", "Sukuna"}
            };

            // Step 5: Loop through and update
            for (String[] pair : updates) {
                psmt.setString(1, pair[0]);
                psmt.setString(2, pair[1]);
                int rows = psmt.executeUpdate();

                if (rows > 0) {
                    System.out.println("Updated: " + pair[1] + " → " + pair[0]);
                } else {
                    System.out.println("No record found for: " + pair[1]);
                }
            }

            psmt.close();
			
			//stmt.executeUpdate(sql);
			
			//System.out.println("Table Created!!");
			//stmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
