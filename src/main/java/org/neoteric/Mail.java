package org.neoteric;

public class Mail {
    public String fromMail;
    public String toEMail;
    public String subject;
    public String message;

    public Mail(String fromMail, String toEMail, String subject, String message) {
        this.fromMail = fromMail;
        this.toEMail = toEMail;
        this.subject = subject;
        this.message = message;
    }
    public Mail(){
    }

    @Override
    public String toString() {
        return "Mail{" +
                "fromMail='" + fromMail + '\'' +
                ", toEMail='" + toEMail + '\'' +
                ", subject='" + subject + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
