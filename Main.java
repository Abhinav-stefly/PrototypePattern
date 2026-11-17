package PrototypePattern;

import PrototypePattern.Email;
import PrototypePattern.PremiumEmail;
public class Main {
    public static void main(String[] args) {
        
        Email e1= new Email("axy@email.com","", "hii", "gretting from nit patna");

        Email e2=e1.copy();
 e2.display();
         PremiumEmail e3= new PremiumEmail("axyz@email.com","", "hii", "gretting from nit patna", "abc@gamil","");
         PremiumEmail e4= e3.copy();

         e4.display();
    }
}