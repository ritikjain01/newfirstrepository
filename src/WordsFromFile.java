import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class WordsFromFile {

	public ArrayList<String> readFile(String filePath) {
		ArrayList<String> listOfWords= new ArrayList<String>();
		try {
			FileInputStream fin = new FileInputStream(filePath);
			DataInputStream ds = new DataInputStream(fin);
			BufferedReader br = new BufferedReader(new InputStreamReader(ds));

			String line = "";
			while ((line = br.readLine()) != null) {

				StringTokenizer st = new StringTokenizer(line);
				while (st.hasMoreTokens()) {
					listOfWords.add(st.nextToken());
	//				System.out.println(st.nextToken());
				}
			}

		} catch (Exception e) {
			System.out.println("Execption");
		}
return listOfWords;
	}

	public void writeToFile(String filepath) {
		try {
			FileOutputStream fos = new FileOutputStream(filepath);
			DataOutputStream dos = new DataOutputStream(fos);

			String example = "I am Writable to a file";
			byte[] bytes = example.getBytes();
			dos.write(bytes);

		} catch (Exception e) {

		}

	}

	public static void main(String args[]) {

		WordsFromFile obj = new WordsFromFile();
		ArrayList<String> wordsFromFile = new ArrayList<String>();
		wordsFromFile= obj.readFile("C:\\Users\\admin\\Desktop\\IntegrationStatus.txt");
		System.out.println(wordsFromFile);
//		obj.writeToFile("C:\\Users\\admin\\Desktop\\IntegrationStatus.txt");

	}

}
