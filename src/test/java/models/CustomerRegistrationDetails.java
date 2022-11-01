package models;

public class CustomerRegistrationDetails {
    public String email;
    public String password;
    public String securityQuestion;
    public String securityAnswer;

    public CustomerRegistrationDetails(String email, String password, String securityQuestion, String securityAnswer) {
        this.email = email;
        this.password = password;
        this.securityQuestion = securityQuestion;
        this.securityAnswer = securityAnswer;
    }
}
