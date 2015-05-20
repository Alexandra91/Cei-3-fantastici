package com.pages.vacation;

import java.util.*;
import javax.mail.*;

public class ReadingEmail {
   
	public static void main(String[] args) {
        Properties props = new Properties();
        props.setProperty("mail.store.protocol", "imaps");
        props.setProperty("mail.imaps.port", "993");

        try {
            Session session = Session.getInstance(props, null);
            Store store = session.getStore("imaps");
            store.connect("mail.evozon.com", "alexandra.pandele@evozon.com", "Cristina_91");              
            Folder inbox = store.getFolder("INBOX");
            inbox.open(Folder.READ_ONLY);
            Message msg = inbox.getMessage(inbox.getMessageCount());            
            System.out.println("You have: " + msg.getMessageNumber()+" inbox messages ");         
            
            Address[] in = msg.getFrom();  
            for (Address address : in) {           	         	
            System.out.println("From:" + address.toString());
            System.out.println("Subject:" + msg.getSubject());
//      	System.out.println("Mail :" + msg.getContent()); 
            }
            
            String mailBody = "";  
         	mailBody = (msg.getContent().toString());
         	mailBody = mailBody.replace("<br />", "");
         	mailBody = mailBody.replace("<br/>", "");
         	mailBody = mailBody.replace("\r\n", "");
         	mailBody = mailBody.replace("	", "");
         	mailBody = mailBody.replace("<!--   Cheers,  The EvoPortal Team-->  Cheers,  The EvoPortal Team", "");
         	mailBody = mailBody.trim();
        	System.out.println(mailBody);         

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
