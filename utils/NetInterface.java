import java.net.*;
import java.io.*;

public class NetInterface
{
	public static void main (String[] args)
	{
			try
			{
				InetAddress address = InetAddress.getByName("192.168.43.115");
				NetworkInterface newtworkInterface = NetworkInterface.getByInetAddress (address);

				if (newtworkInterface != null) {

					System.out.println("Network Interface name : " + newtworkInterface.getName());
					System.out.println("Display name of Interface : " + newtworkInterface.getDisplayName());
					System.out.println("Interface Hardware address : " + convertByteToString(newtworkInterface.getHardwareAddress()));

				} else {
					System.out.println ("Interface not found");
				}
			}
			catch (Exception e) {
				System.out.println (e.toString());
			}
	}

	public static String convertByteToString(byte[] mac) {
		if (mac == null)	return null;

		StringBuilder sb = new StringBuilder (18);
		for (byte b : mac)
		{
			if (sb.length() > 0)
			{
				sb.append(':');
			}
			sb.append(String.format("%02x", b));
		}
		return sb.toString();
	}	
}