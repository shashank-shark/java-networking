import java.io.*;
import java.net.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UrlHandling
{
	public static void main (String[] args) throws IOException
	{
		URL url = new URL ("http://code2noobs.blogspot.com");
		URLConnection myUrl = url.openConnection();
		BufferedReader reader = new BufferedReader (new InputStreamReader (myUrl.getInputStream()));
		String inputLine;

		while ((inputLine = reader.readLine()) != null)
		{
			System.out.println (inputLine);
		}

		
	}
}