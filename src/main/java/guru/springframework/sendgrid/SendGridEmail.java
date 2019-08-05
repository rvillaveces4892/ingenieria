package co.com.computec.sendgrid;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class SendGridEmail {
	private static final String SMTP_HOST_NAME = "smtp.sendgrid.net";
	private static final String SMTP_AUTH_USER = "azure_fc905d1e074195f11ad84bb87494fc62@azure.com";
	private static final String SMTP_AUTH_PaWD = "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";

	public static void main(String[] args) throws Exception {
		
		new SendGridEmail().SendMail();
	}

	public void SendMail() throws Exception {
		try {
			Properties properties = new Properties();
			properties.put("mail.transport.protocol", "smtp");
			properties.put("mail.smtp.host", SMTP_HOST_NAME);
			properties.put("mail.smtp.port", 25);
			properties.put("mail.smtp.auth", "true");
			Authenticator auth = new SMTPAuthenticator();
			Session mailSession = Session.getDefaultInstance(properties, auth);
			MimeMessage message = new MimeMessage(mailSession);
			Multipart multipart = new MimeMultipart("alternative");
			BodyPart part1 = new MimeBodyPart();
			part1.setText("Hello, Your Contoso order has shipped. Thank you, John");
			BodyPart part2 = new MimeBodyPart();
			part2.setContent("<p>Hello,</p> <p>Your Contoso order has <b>shipped</b>.</p> <p>Thank you,<br>John</br></p>",
			    "text/html");
			multipart.addBodyPart(part1);
			multipart.addBodyPart(part2);
			message.setFrom(new InternetAddress("rvillaveces@outlook.com"));
			message.addRecipient(Message.RecipientType.TO,
			   new InternetAddress("rvillaveces4892@gmail.com"));
			message.setSubject("Your recent order");
			message.setContent(multipart);
			Transport transport = mailSession.getTransport();
//		java.net.URL classUrl = this.getClass().getResource("com.sun.mail.util.TraceInputStream");
//		co.com.computec(classUrl.getFile());
			// Connect the transport object.
			transport.connect();
			// Send the message.
			transport.sendMessage(message, message.getAllRecipients());
			// Close the connection.
			transport.close();
		} catch (Exception e) {
			
		}
	}
	
	
	private class SMTPAuthenticator extends javax.mail.Authenticator {
		public PasswordAuthentication getPasswordAuthentication() {
		   String username = SMTP_AUTH_USER;
		   String pssw = SMTP_AUTH_PaWD;
		   return new PasswordAuthentication(username, pssw);
		}
	}
}
