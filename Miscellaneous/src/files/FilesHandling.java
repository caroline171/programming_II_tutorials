package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilesHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("input.txt");
		try {
			FileReader reader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(reader);
			String line = bufferedReader.readLine();
			while(bufferedReader.ready()) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("File NOt Found");
		}
	}

}
