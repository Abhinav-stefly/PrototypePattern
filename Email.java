package PrototypePattern ;

public class Email implements Copyable<Email> {
private String sender;
private String receiver;
private String subject;
private String body;

Email(String sender, String receiver, String subject, String body){
this.sender=sender;
this.receiver=receiver;
this.subject=subject;
this.body=body;
}


Email(Email e){
 this.sender=e.sender;
this.receiver=e.receiver;
this.subject=e.subject;
this.body=e.body;   
}

// copy constructor
// Email return type
// copy method
// Email argument
  @Override
  public Email copy(){
    return new Email(this);
  }


   
    // getters n setters
    public String getSender(){
        return sender;
    }

     public void setSender(){
        this.sender=sender;
    }
    public void setReceiver(){
        this.receiver=receiver;
    }
    public String getReceiver(){
        return receiver;
    }

    public void setBody(){
        this.body =body;
    }
    public String getBody(){
        return body;
    }

   
    public String getSubject(){
        return subject;
    }

    public void setSubject(){
        this.subject=subject;
    }

    public void display(){
        System.out.println(sender);
        System.out.println(receiver);
        System.out.println(body);
        System.out.println(subject);
    }
}