package org.neoteric;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailService {
        public boolean validateEmail(String email){
        String regexp="^(.+)@(.+)$";
        Pattern pattern=Pattern.compile(regexp);
        Matcher matcher= pattern.matcher(email);
        return matcher.matches();
    }
        private boolean isValidEmail(Mail email,String type){
        if(email==null ||email.fromMail==null ||!validateEmail(email.fromMail)){
            System.out.println("Invalid"+type+""+"email address");
            return false;
        }else{
            System.out.println("valid"+type+" "+"emailaddress");
            return true;
        }

    }
      private boolean isValidMessage(Mail composeEmail) {
        if (composeEmail == null || composeEmail.message == null || composeEmail.message.isEmpty()) {
            System.out.println("Please compose an email.");
            return false;
        }
        System.out.println("Successfully composed the mail.");
        return true;
    }
    public String sendEmail(Mail fromEmail,Mail toEmail,Mail subject,Mail composeEmail){
       if(fromEmail!=null&&validateEmail(fromEmail.fromMail)){
           System.out.println("Valida email "+fromEmail.fromMail);
      }else{
           System.out.println("invalid email address");
           return null;
       }
       if(toEmail!=null&&validateEmail(toEmail.toEMail)){
           System.out.println("Valida email "+toEmail.toEMail);
     }else{
          System.out.println("invalid email address");
         return null;
       }if(composeEmail!=null){
            System.out.println("successfully sent a mail");
       }else {
            System.out.println("please compose a email");
            return null;
        }

     return " successfully send a email address";
    }
}
