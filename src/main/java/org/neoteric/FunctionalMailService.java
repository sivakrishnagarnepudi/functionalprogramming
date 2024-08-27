package org.neoteric;

import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FunctionalMailService {


    public Predicate<String> validateEmail=(email)->{
        String regexp="^(.+)@(.+)$";
        Pattern pattern=Pattern.compile(regexp);
        Matcher matcher= pattern.matcher(email);
        return matcher.matches();
};

    private BiPredicate<Mail,String>isValidEmail=(email,type)->{
    if(email==null ||email.fromMail==null ||!validateEmail.test(email.fromMail)){
            System.out.println("Invalid"+type+""+"email address");
            return false;
        }else{
            System.out.println("valid"+type+" "+"emailaddress");
            return true;
        }
};



    private Predicate<Mail>isValidMessage=(composeEmail)->{
        if (composeEmail==null||composeEmail.message==null||composeEmail.message.isEmpty()){
        System.out.println("Please compose An compose Email");
        return false;
    }
    System.out.println("Successfully composed the mail.");
    return true;
};
//
    public MailFunction sendEmail=(fromEmail,toEmail,subject,composeEmail)->{
    if(!isValidEmail.test(fromEmail,"from") )return null;
    if(!isValidEmail.test(toEmail,"to")) return null;
    if (!isValidMessage.test(composeEmail)) return null;

    return " successfully send a email address";
};

    public static void main(String[] args) {
        FunctionalMailService functionalMailService = new FunctionalMailService();

        // Creating Mail objects for the sender, recipient, subject, and message
        Mail email = new Mail("gsivakrishna007@gmail.com", "garnepudisivakrishna54@gmail.com", "Job-Offerletter", "Hi Siva Krishna Garnepudi.\n" +
                "\n" +
                "Congratulations, further to your discussion with us, we would like to offer you the position of  Software Engineer with NEOTERIC TECHNOLOGIES PVT. LTD. We would like you to start by  3rd May 2024.  NEOTERIC  TECHNOLOGY PVT. LTD is excited to bring you to the Team.  Your remuneration details are mentioned in the offer Letter.\n" +
                "Please reply to this email with your acceptance of the role and a signed copy of this document. Once again Congratulations and please feel free to contact me should you have any questions.");



        // Sending the email using the sendEmail method
        String result = functionalMailService.sendEmail.apply(email, email, email, email);
        System.out.println(email);

        // Printing the result
        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("Failed to send the email.");
        }
    }


}
