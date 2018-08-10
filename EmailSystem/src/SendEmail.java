import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class SendEmail
{
	public static void main(String[] args) 
	{
		try
		{
			String host = "smtp.gmail.com";
			String user = "www.shashankreddy@gmail.com";
			String pass = "sirdavyjones";
			String to = "shashankj.16cs@saividya.ac.in";
			String from = "www.shashankreddy@gmail.com";
			String subject = "This mail is arriving from our program";
			String messageText = "Hi welcome to the networkingProject";
			boolean sessionDebug = false;
			
			Properties props = System.getProperties();
			
			props.put("mail.smtp.starttls.enable","true");
			props.put("mail.smtp.host",host);
			props.put("mail.smtp.port","587");
			props.put("mail.smtp.auth","true");
			props.put("mail.smtp.starttls.required","true");
			
//			java security
			
			java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
			
			Session mailSession = Session.getDefaultInstance(props,null);
			mailSession.setDebug(sessionDebug);
			Message msg = new MimeMessage(mailSession);
			msg.setFrom(new InternetAddress(from));
			InternetAddress[] address = {new InternetAddress(to)};
			msg.setRecipients(Message.RecipientType.TO, address);
			msg.setSubject(subject);
			msg.setSentDate(new Date());
			msg.setText(messageText);
			
			Transport transport =  mailSession.getTransport("smtp");
			transport.connect(host,user,pass);
			transport.sendMessage(msg, msg.getAllRecipients());
			transport.close();
			System.out.println("Message sent successfully");
		}
		catch (Exception ex)
		{
			System.out.println(ex.toString());
		}
	}
}