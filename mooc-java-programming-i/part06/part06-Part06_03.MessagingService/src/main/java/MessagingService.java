
import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> messages;

    public MessagingService() {
        this.messages = new ArrayList<Message>();
    }

    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            messages.add(message);
        }
    }

    public ArrayList<Message> getMessages() {
        return this.messages;
    }
}
