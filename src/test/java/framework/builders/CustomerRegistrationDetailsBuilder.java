package framework.builders;

import models.CustomerRegistrationDetails;

//probably should not make this static in case we want to run tests in parallel
public class CustomerRegistrationDetailsBuilder {
    private String email = "abc@gmail.com";
    private String password = "password123";
    private String securityQuestion = " Name of your favorite pet? ";
    private String securityAnswer = "Zouzu";

    public CustomerRegistrationDetailsBuilder setEmail(String email){
        this.email = email;
        return this;
    }

    public CustomerRegistrationDetailsBuilder setPassword(String password){
        this.password = password;
        return this;
    }

    public CustomerRegistrationDetailsBuilder setSecurityQuestion(String securityQuestion){
        this.securityQuestion = securityQuestion;
        return this;
    }

    public CustomerRegistrationDetailsBuilder setSecurityAnswer(String securityAnswer){
        this.securityAnswer = securityAnswer;
        return this;
    }

    public CustomerRegistrationDetails build(){
        return new CustomerRegistrationDetails(email,password,securityQuestion,securityAnswer);
    }
}
