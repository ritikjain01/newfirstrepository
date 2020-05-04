
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReadFileUsingList {

	static List readingWithList(File fpath) throws IOException {

		List<String> mylist = Collections.emptyList();

		mylist = Files.readAllLines(fpath.toPath(), StandardCharsets.UTF_8);
		return mylist;
	}

	public static void main(String args[]) throws IOException {
		File f = new File("C:\\Users\\admin\\Documents\\ReadingExample.txt");
		List newlist = readingWithList(f);

		Iterator<String> itr = newlist.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
