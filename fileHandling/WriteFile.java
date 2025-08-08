package fileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		String filePath = "write.txt";

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
			writer.write("Hello Guys!!!");
			writer.newLine();
			System.out.println("Updated the file.");
		} 
		catch (IOException e) {
			System.out.println("Error in writing file");
			e.printStackTrace();
		}

		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line;
			System.out.println("\n--- File Content ---");
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} 
		catch (IOException e) {
			System.out.println("Error in reading file");
			e.printStackTrace();
		}
	}
}
