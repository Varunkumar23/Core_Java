package FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class serialization {

	static class Student implements Serializable {
		String name;
		int id;

		public Student() {
		}

		Student(String name, int id) {
			this.name = name;
			this.id = id;
		}
	}
	//serialization : creating the objects and storing them in a file as garbage collector will not delete this file objects automatically

	public static void main(String[] args) throws IOException {
		Student s1 = new Student("Varun", 1);

		File file1 = new File("s:\\FileHandling\\serializable.ser");
		try {
			file1.createNewFile();
		} catch (Exception e) {
			e.printStackTrace();
		}

		FileOutputStream fiOutputStream = new FileOutputStream(file1);
		ObjectOutputStream outputStream = new ObjectOutputStream(fiOutputStream);
		outputStream.writeObject(s1);

	}

}
