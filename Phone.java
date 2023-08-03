// package com.codingdojo.devices;

public class Phone extends Device {
	public void makeCall() {
		battery -= 5;
		status();
	}

	public void playGame() {
        if (this.battery < 25) {
            System.out.println("Battery is less than 25 percent");
        } else {
            battery -= 20;
            status();
        }
	}

	public void charge() {
		battery += 50;
		status();
	}

}
