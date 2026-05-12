package labEvalTwo;
interface Notifiable{
	void sendNotification(String message);
	
	default void logNotification(String msg) {
		System.out.println("[LOG] "+msg);
	}
}
interface Schedulable{
	void schedule(String time);
}

abstract class BaseNotifier implements Notifiable{
	String recipient;
public BaseNotifier(String recipient) {
		this.recipient = recipient;
	}

@Override
public void logNotification(String msg) {
	System.out.println("[LOG] " + msg);
	System.out.println();
}
}
class EmailNotifier extends BaseNotifier{
	String emailId;

	public EmailNotifier(String recipient, String emailId) {
		super(recipient);
		this.emailId = emailId;
	}
	@Override
	public void sendNotification(String message) {
		String output = "Email to " + emailId + ": " + message;
        System.out.println(output);
        logNotification(output);
	}
}
class SMSNotifier extends BaseNotifier implements Schedulable {
    String phoneNumber;

    public SMSNotifier(String recipient, String phoneNumber) {
        super(recipient);
        this.phoneNumber = phoneNumber;
    }
    @Override
    public void sendNotification(String message) {
        System.out.println("SMS to " + phoneNumber + ": " + message);
    }

    @Override
    public void schedule(String time) {
        System.out.println("SMS to " + phoneNumber + " scheduled at " + time);
    }
}


public class NotificationSystem {

	public static void main(String[] args) {
		EmailNotifier email = new EmailNotifier("Alice", "alice@mail.com");
        SMSNotifier sms = new SMSNotifier("Bob", "9876543210");
        
        email.sendNotification("Server is down!");
        sms.sendNotification("Alert!");
        
        Schedulable s = sms;
        s.schedule("09:00 AM");
        
        email.logNotification("Email to alice@mail.com: Server is down!");
		

	}

}
