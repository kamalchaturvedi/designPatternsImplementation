package com.kamal.singleton.execution;

import com.kamal.singleton.Device;

public class MainClass {
	public static void main(String[] args) {
		Device device = Device.getDeviceObject();
		System.out.println(device.getDeviceId() + " " + device.getDeviceName());
	}
}
