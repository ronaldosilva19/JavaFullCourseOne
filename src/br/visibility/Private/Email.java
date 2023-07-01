package br.visibility.Private;

/**
 * Class used to represent an email that will be sent.
 *
 * @author Jose Ronaldo da Silva
 */
public class Email {
    private String sender;
    private String recipient;
    private String subject;
    private String message;

    public void toSendEmail(String sender, String recipient,
                            String subject, String message){
        this.sender = sender;
        this.recipient = recipient;
        this.subject = subject;
        this.message = message;

        if(this.ValidateEmail()){
            this.toSend();
            System.out.println("Sent.");
        }else{
            System.out.println("It was not possible to send the email.");
        }
    }
    private boolean ValidateEmail(){
        boolean ok = false;
        // Code to validate that the email information is correct.
        return ok;
    }
    private void toSend(){
        // Send the email.
    }
}
