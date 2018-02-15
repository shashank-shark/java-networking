import java.io.*;
import java.net.*;

public class UdpClient
{
	public static void main (String[] args)
	{
		try
		{
			DatagramSocket clientSocket = new DatagramSocket (0);

			/* Now creating a byte array to store incoming data and outgoing data */
			byte[] sendData = new byte[1024];
			byte[] recieveData = new byte[1024];
		}
		catch (Exception e)
		{
			System.out.println (e.toString());
		}
	}
}