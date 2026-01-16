package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.BreakIterator;

public class IntroductionToFileHandling {

	public static void main(String[] args) throws IOException {
		// to create the folder
		File folder = new File("s:\\FileHandling");
		folder.mkdir();

		// to create the file in that folder
		File file1 = new File(folder, "Student.txt");
		try {
			file1.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		File file2 = new File(folder, "Teachers.txt");

		try {
			file2.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// checking if there are any files in that folder and and storing them into an
		// array to see the files present in it

		if (folder.exists()) {
			File[] files = folder.listFiles();
			for (int i = 0; i < files.length; i++) {
				System.out.println(files[i].getName());
			}
		}

//		FileWriter writer=new FileWriter(file1);
//		writer.write("Hello Darling");
//		writer.close();
//		

		BufferedWriter bWriter = new BufferedWriter(new FileWriter(file2));
		bWriter.write("Hello Teachers\n" + "Have a good day");
		bWriter.close();

		BufferedReader br = new BufferedReader(new FileReader(file2));
		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
		
		
		// 

	}

}
