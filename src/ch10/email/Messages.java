package ch10.email;

public class Messages {

  private String text;
  private String sender;
  private String recipient;

  public Messages(String sender, String recipient, String text) {
    this.sender = sender;
    this.recipient = recipient;
    this.text = text;
  }

  public String getText() {
    return this.text;
  }

  public String getSender() {
    return this.sender;
  }

}
