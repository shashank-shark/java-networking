

public class InetAddressValidator{
	public static void main(String[] args) {
		// InetAddressValidator validator = new InetAddressValidator ();
		String ipAddress = "192.168.0.321";
		// boolean isValid = validator.isValid(ipAddress);

		 if (validateIpAddress(ipAddress)) {
		 	System.out.println ("ip "+ipAddress+" is valid");
		 } else {
		 	System.out.println ("ip "+ipAddress+" is Invalid");
		 }

	}

		public static boolean validateIpAddress (String ipAddress)
		{
			String[] numbers = ipAddress.split("//.");
			if (numbers.length != 4)
			{
				return false;
			}

			for (String str : numbers)
			{
				int i = Integer.parseInt(str);
				if ((i<0) || (i>255))
				{
					return false;
				}
			}
			return false;
		}
	}