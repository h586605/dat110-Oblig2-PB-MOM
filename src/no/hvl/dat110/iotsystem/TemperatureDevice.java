package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.common.TODO;

public class TemperatureDevice {

	private static final int COUNT = 10;

	public static void main(String[] args) {

		// simulated / virtual temperature sensor
		TemperatureSensor sn = new TemperatureSensor();

		// TODO - start

		Client klient = new Client("Sensor", Common.BROKERHOST, Common.BROKERPORT);

		klient.connect();
		
		for (int i = 0; i < COUNT; i++) {
			klient.publish(Common.TEMPTOPIC, "" + sn.read());
			try {
				Thread.sleep(5000);
			} catch(InterruptedException e) {
			}
		}
		
		klient.disconnect();

		// TODO - end

		System.out.println("Temperature device stopping ... ");

	}
}
