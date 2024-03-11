package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import com.aventstack.extentreports.ExtentTest;

public class SendEmail {

    static String emailSent = "sent email";

    public static void sendMail(ExtentTest extentTest) {

        Properties props = new Properties();

        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.ssl.checkserveridentity", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        try {

            Session session = Session.getDefaultInstance(props,

                    new javax.mail.Authenticator() {

                        protected PasswordAuthentication getPasswordAuthentication() {

                            return new PasswordAuthentication("halogen.club@gmail.com", "wlmu ngrt slog sltx");
                        }

                    });

            Message message = new MimeMessage(session);

            message.setFrom(new InternetAddress("halogen.club@gmail.com"));

            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("halogen.club@gmail.com"));

            message.setSubject("Mayo Clinic Test Report");

            BodyPart messageBodyPart1 = new MimeBodyPart();
            messageBodyPart1.setText("PFA");
            MimeBodyPart messageBodyPart2 = new MimeBodyPart();

            String filename = getLastModified(System.getProperty("user.dir") + "/reports");

            if (filename == null) {
                throw new FileNotFoundException("Incorrect or Null FilePath");
            }

            DataSource source = new FileDataSource(filename);
            messageBodyPart2.setDataHandler(new DataHandler(source));
            messageBodyPart2.setFileName("Mayo Clinic Test Report.html");

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart2);
            multipart.addBodyPart(messageBodyPart1);
            message.setContent(multipart);

            Transport.send(message);

            LoggerHandler.logInfo(emailSent);
            extentTest.pass(emailSent);

        } catch (FileNotFoundException e) {
            LoggerHandler.logError("Report missing");
            extentTest.fail("Report missing");
        } catch (MessagingException e) {
            LoggerHandler.logError("not " + emailSent);
            extentTest.fail("not " + emailSent);
        }

    }

    public static String getLastModified(String directoryFilePath) {
        File directory = new File(directoryFilePath);
        File[] files = directory.listFiles(File::isFile);
        long lastModifiedTime = Long.MIN_VALUE;
        File chosenFile = null;
        if (files != null) {
            for (File file : files) {
                if (file.lastModified() > lastModifiedTime) {
                    chosenFile = file;
                    lastModifiedTime = file.lastModified();
                }
            }
        }

        if (chosenFile != null)
            return chosenFile.getAbsolutePath();
        return "";
    }

}
