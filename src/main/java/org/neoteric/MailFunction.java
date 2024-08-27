package org.neoteric;
@FunctionalInterface
public interface MailFunction {
    String apply(Mail fromEmail, Mail toEmail, Mail subject, Mail composeEmail);
}
