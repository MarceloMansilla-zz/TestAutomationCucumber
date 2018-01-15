package utils;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailSender {
	public static void sendMail() {
		//Properties props = System.getProperties();
		Properties props = new Properties();
        props.setProperty("mail.smtp.host", "smtp.dracux.com");
        props.setProperty("mail.smtp.starttls.enable", "true");
        //props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
        //props.setProperty("mail.smtp.socketFactory.fallback", "false");
        props.setProperty("mail.smtp.port", "587");
        //props.setProperty("mail.smtp.socketFactory.port", "587");
        props.setProperty("mail.smtp.user", "pruebas@dracux.com");
        props.setProperty("mail.smtps.auth", "true");
        Session session = Session.getInstance(props, null);
        session.setDebug(true);
        MimeMessage message = new MimeMessage(session);
        try {
			message.setFrom(new InternetAddress("pruebas@dracux.com"));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress("ssoifer@belatrixsf.com")); //CC or BCC
			message.setSubject("Reporte del test");
			message.setText("Envio del reporte del test");
			//TODO: zip attachment
			//message.ATTACHMENT
			Transport t = session.getTransport("smtp");
			t.connect("pruebas@dracux.com","sapoPepe123");
			t.sendMessage(message,message.getAllRecipients());
			t.close();
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
}
