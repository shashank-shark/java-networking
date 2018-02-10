import java.io.*;
import java.net.*;

public class RemotePortScanner
{
	public static void main (String[] args)
	{
		/* Create a buffer that reads the user input */
		InputStreamReader in = new InputStreamReader (System.in);
		BufferedReader reader = new BufferedReader (in);

		String targetIp = "";
		int fromPort = 0;
		int toPort = 0;

		System.out.print ("Enter the target IP : ");

		try
		{
			targetIp = reader.readLine();
		}
		catch (Exception e)
		{
			System.out.println ("Cannot read the entered IP address" + e.toString());
		}

		/* Boolean value which is used to control the validation process */
		boolean isValid = false;

		while (!isValid)
		{
			try
			{
				System.out.println ("Enter the starting port (ranges from 0 - 65536)");
				String portString = reader.readLine();
				fromPort = Integer.parseInt(portString);

				/* Check whether the given port is valid or invalid */
				if (fromPort >=0 && fromPort <= 65536)
				{
					isValid = true;
				}
				else
				{
					System.out.println ("Invalid Port! Port range is: 0 - 65536");
				}
			} 
			catch (NumberFormatException e1)
			{
				System.out.println ("Please enter a number !" + e1.toString());
			}
			catch (Exception e)
			{
				System.out.println ("Cannot read the first port number :" + e.toString());
			}
		}

		/* Now to get the toPort value */
		isValid = false;

		while (!isValid)
		{
			try
			{
				System.out.println ("Enter the ending port number");
				String toPortString = reader.readLine();
				toPort = Integer.parseInt(toPortString);

				if (toPort >= 0 && toPort <= 65536)
				{
					if (toPort >= fromPort)
					{
						isValid = true;
					}
				}
			}
			catch (NumberFormatException e1)
			{
				System.out.println ("Please enter a valid number" + e1.toString());
			}
			catch (Exception e)
			{
				System.out.println ("Enter a valis port number " + e.toString());
			}
		}

		int port = fromPort;	//Starting with fromPort value

		while (port >= fromPort && port <= toPort)
		{
			try
			{
				/* Now opening a Socket to start the scan */
				Socket socket = new Socket (targetIp, port);
				System.out.println ("Port " + port + " is in listening state");
				/* Just open and close the scoket , we are here to enter into the target system */
				socket.close();
			}
			catch (UnknownHostException e1)
			{
				System.out.println ("Unkonwn Host Exception" + e1.toString());
			}
			catch (IOException e2)
			{
				System.out.println ("IOException occurred " + e2.toString());
			}
			catch (Exception e)
			{
				System.out.println (e.toString());
			}

			port++;
		}

	}
}