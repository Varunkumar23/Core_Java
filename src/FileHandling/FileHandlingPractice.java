package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingPractice {

	public static void main(String[] args) throws IOException {

		File folder = new File("s:\\LovelyProfessionalUniversity");
		if (!folder.exists()) {
			if (folder.mkdir()) {
				System.out.println("Folder created successfully.");
			} else {
				System.out.println("Failed to create folder.");
			}
		}

		File file1 = new File(folder, "Students.txt");
		try {

			file1.createNewFile();
		} catch (IOException e) {
			System.out.println("Error while creating the file");
		}

		File file2 = new File(folder, "Teachers.txt");
		try {

			file2.createNewFile();
		} catch (IOException e) {
			System.out.println("Error while creating the file");
		}

		File file3 = new File(folder, "Security.txt");
		try {

			file3.createNewFile();
		} catch (IOException e) {
			System.out.println("Error while creating the file");
		}

		File file4 = new File(folder, "Administrative.txt");
		try {

			file4.createNewFile();
		} catch (IOException e) {
			System.out.println("Error while creating the file");
		}

		if (folder.exists()) {
			File[] files = folder.listFiles();
			for (int i = 0; i < files.length; i++) {
				System.out.println(files[i].getName());
			}
		}

		try (BufferedWriter bWriter = new BufferedWriter(new FileWriter(file1))) {

			bWriter.write("Welcome to Lovely Professional University!\n");
			bWriter.newLine();
			bWriter.write("This is the file of students.");
		}
		
		try (BufferedWriter bWriter = new BufferedWriter(new FileWriter(file2))) {

			bWriter.write("Welcome to Lovely Professional University!\n");
			bWriter.newLine();
			bWriter.write("This is the file of Teachers.");
		}
		
		try (BufferedWriter bWriter = new BufferedWriter(new FileWriter(file3))) {

			bWriter.write("Welcome to Lovely Professional University!\n");
			bWriter.newLine();
			bWriter.write("This is the file of Security gaurds.");
		}
		
		BufferedReader bReader=new BufferedReader(new FileReader(file1));
		String line;
		while((line=bReader.readLine())!=null) {
			System.out.println(line);
		}
		
		

	}

}
