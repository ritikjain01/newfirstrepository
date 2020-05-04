import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReading {

	static void readingFromFile() throws IOException {
		File fpath = new File("C:\\Users\\admin\\Documents\\ReadingExample.txt");
		FileInputStream fin = new FileInputStream(fpath);
		int endOfFile = 0;
		while ((endOfFile = fin.read()) != -1) {
			System.out.print((char) endOfFile);
		}
		fin.close();
	}

	static void writingToFile(String data) throws IOException {
		File fpath = new File("C:\\Users\\admin\\Documents\\WritingExample.txt");
		FileOutputStream fout = new FileOutputStream(fpath);
		int endOfFile = 0;
		byte b[] = data.getBytes();
		fout.write(b);
		fout.close();
	}

	public static void main(String args[]) throws IOException {
		readingFromFile();
		writingToFile("I am Written by JAVA PROGRAM");
	}
}
