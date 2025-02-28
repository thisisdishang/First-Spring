package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {
    // field injection
    @Autowired
    String messageType;

    public void printMessage() {
        switch (messageType) {
            case "long":
                System.out.println("Whatever i has to say has already crossed your mind!");
                break;
            case "short":
                System.out.println("My answer has already crossed yours");
                break;
        }
    }
}
