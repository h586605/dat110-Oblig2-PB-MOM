package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.messages.Message;
import no.hvl.dat110.messages.PublishMsg;
import no.hvl.dat110.common.TODO;

public class DisplayDevice {
	
	private static final int COUNT = 10;
		
	public static void main (String[] args) {
		
		System.out.println("Display starting ...");
		
		// TODO - START
				
		Client klient = new Client("Display", Common.BROKERHOST, Common.BROKERPORT);
		
		klient.connect();
		klient.createTopic(Common.TEMPTOPIC);
		klient.subscribe(Common.TEMPTOPIC);
		for (int i = 0; i < COUNT; i++) {
			System.out.println("DISPLAY: " + ((PublishMsg) klient.receive()).getMessage());
		}	
		klient.unsubscribe(Common.TEMPTOPIC);
		klient.disconnect();
		// TODO - END
		
		System.out.println("Display stopping ... ");
		
	}
}
