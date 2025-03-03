package messages;

public class MessageReader {
    String message;
    Integer age;

    public MessageReader(String message, Integer age) {
        this.message = message;
        this.age = age;
    }

    public void display() {
        System.out.println(message);
        System.out.println("Your age is " + age);
    }
}
