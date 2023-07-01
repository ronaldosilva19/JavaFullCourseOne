package br.visibility.Private;

import Constructors.Example2.Person;

/**
 * @author Jose Ronaldo da Silva
 */
public class TestEmail {
    public static void main(String[] args) {
        Email email = new Email();
        email.toSendEmail(
                "ronaldo@silva.com.br",
                "josesilva@com.br",
                "OPP class - Visibility.",
                "Class on visibility in Java is available."
        );
        //email.sender = "ronaldo@silva,con.br"; Compilation ERROR.
        //email.toSend(); Compilation ERROR.

        //Person person = new Person(); Compilation ERROR.
    }

}
