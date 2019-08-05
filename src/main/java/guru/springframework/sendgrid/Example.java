package co.com.computec.sendgrid;

import com.sendgrid.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.codec.binary.Base64;

public class Example {
	public static void main(String[] args) throws IOException {
//		Email from = new Email("rvillaveces4892@gmail.com");
//		String subject = "Sending with SendGrid is Fun";
//		Email to = new Email("rvillaveces@outlook.com");
		Content content = new Content("text/plain", "and easy to do anywhere, even with Java");
//		Mail mail = new Mail(from, subject, to, content);
		Mail mail = new Mail();
		Personalization p = new Personalization();
		p.addTo(new Email("rvillaveces@outlook.com"));
		p.addTo(new Email("rvillavecess@gmail.com"));
		p.setSubject("Adjunto de archivo pdf");
		mail.addPersonalization(p);
		mail.setFrom(new Email("rvillaveces4892@gmail.com"));
		mail.addContent(content);
		File pdf = new File("C:\\Users\\rvillaveces\\Documents\\Pago eCollect 62372365.pdf");
		byte[] fileData = null;
        try {
            fileData = org.apache.commons.io.IOUtils.toByteArray(new FileInputStream(pdf));
        } catch (IOException ex) {
        }
		Attachments a = new Attachments();
		Base64 b64 = new Base64();
		String contentString = b64.encodeAsString(fileData);
		a.setContent(contentString);
		a.setType("application/pdf");//"application/pdf"
        a.setFilename(pdf.getName());
        a.setDisposition("attachment");
        a.setContentId("pdf1");
		mail.addAttachments(a);

		SendGrid sg = new SendGrid("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");
		Request request = new Request();
		try {

			request.setMethod(Method.POST);
			request.setEndpoint("mail/send");
			request.setBody(mail.build());
			Response response = sg.api(request);
//			System.out.println(response.getStatusCode());
//			System.out.println(response.getBody());
//			System.out.println(response.getHeaders());
		} catch (IOException ex) {
			throw ex;
		}
	}
}