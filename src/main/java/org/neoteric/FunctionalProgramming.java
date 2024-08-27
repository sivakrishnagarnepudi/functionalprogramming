package org.neoteric;

import java.util.function.*;

public class FunctionalProgramming {
    public String name = "shiva";

    public Function<String, String> upperCaseFunc = (name) -> {
        return name.toUpperCase();
    };

    public String upperCase(String name) {
        return name.toUpperCase();
    }

    public BiFunction<String, Integer, String> toLowerCase = (name, i) -> {
        return name.toUpperCase();
    };

    public String getName(BiFunction<String, Integer, String> toLowerCase, String name) {
        return toLowerCase.apply("Neoteric", 10);
    }
    public String toLowerCases(String name,int i){
      return   "toLowerCase";
    }

    public Supplier<String> sendMessage = () -> {
        return "Message";
    };

    public String sendMessages() {
        return "SuccessFullySendTheMessage";

    }


    public void sendMail(Mail mails) {
        System.out.println("mail-successfully send");

    }
//    Predicate<Mail> confirmPassword=(password)->password.equals(new Mail("dd","dd","dd","dd"));
      public BiPredicate<String,String> biPredicate=(p,c)->{
        return p.equals(c);
};


    Mail mail = new Mail("gsivakrishna007@gmail.com", "garnepudisivakrishna54@gmail.com", "Job-Offerletter", "Hi Siva Krishna Garnepudi.\n" +
            "\n" +
            "Congratulations, further to your discussion with us, we would like to offer you the position of  Software Engineer with NEOTERIC TECHNOLOGIES PVT. LTD. We would like you to start by  3rd May 2024.  NEOTERIC  TECHNOLOGY PVT. LTD is excited to bring you to the Team.  Your remuneration details are mentioned in the offer Letter.\n" +
            "Please reply to this email with your acceptance of the role and a signed copy of this document. Once again Congratulations and please feel free to contact me should you have any questions.");


    Consumer<Mail> sendMail = (messageMail) -> {
        System.out.println("mail-successfully send" + mail);
    };

    public static void main(String[] args) {



      FunctionalProgramming functionalProgramming=new FunctionalProgramming();
        System.out.println(functionalProgramming.biPredicate.test("PassWord","PassWord"));
    }
}
