package no.hvl.dat110.messages;


public class PublishMsg extends Message {
	
	// message sent from client to create publish a message on a topic 

	private String message;
	private String topic;
	
	public PublishMsg(String user, String topic, String message) {
		super(MessageType.PUBLISH, user);
		this.message = message;
		this.topic = topic;
	}
	
	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "PublishMsg [ " + super.toString() + "message=" + message + ", topic=" + topic + "]";
	}
	
	
}
