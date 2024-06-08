import java.io.BufferedReader;
import java.io.FileReader;

public class FileTester
{
	public static void main(String [] args)
	{
		BufferedReader reader=null;
		int charCount=0;
		int wordCount=0;
		int linecount=0;
		try {
			reader =new BufferedReader(new FileReader("D:\\try.txt"));
			String line=reader.readLine();
			while(line!=null) {
				linecount++;
				String [] words =line.split("[!?.: ]+");
				wordCount = wordCount + words.length;
				for(String word:words) {
					charCount=charCount+word.length();
				}
				line=reader.readLine();
			}
			System.out.println(charCount);
			System.out.println(wordCount);
			System.out.println(linecount);
		}
		catch(Exception e) {
		}
	}
}