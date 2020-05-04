import java.awt.DisplayMode;
import java.io.File;

public class DirectoryPath {

	public static boolean isFilePresent(String downloadPath, String fileName) {
		boolean flag = false;
		File dir = new File(downloadPath);
		File[] dir_contents = dir.listFiles();
		System.out.println("Total Number of files in this directory is " + dir_contents.length);

		for (int i = 0; i < dir_contents.length; i++) {
			if (dir_contents[i].getName().equals(fileName)) {
				System.out.println("File has been Found");
				System.out.println("Deleting the file now...");
				dir_contents[i].delete();
				System.out.println("File has been deleted");

				return flag = true;
			}
		}
		System.out.println("File is not there in the folder");
		return flag;
	}

	public static String getNewDownloadFilePath() {
		String mydir = System.getProperty("user.dir");
		System.out.println("Current working directory is " + mydir);
		String addition = "\\src\\resources\\downloads";
		mydir = mydir + addition;
		System.out.println("Now working directory is " + mydir);
		return mydir;
	}
	
	public static void setNewDownloadPathChrome() {
		String downloadFilepath = getNewDownloadFilePath();
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadFilepath);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		WebDriver driver = new ChromeDriver(options);
	}

	public static void main(String args[]) {
		isFilePresent(getNewDownloadFilePath(), "text.txt");
	}
}
