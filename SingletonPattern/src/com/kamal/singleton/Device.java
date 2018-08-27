package com.kamal.singleton;

public class Device {

	private static Device device;
	String deviceId;
	String deviceName;

	private Device(String deviceId, String deviceName) {
		super();
		this.deviceId = deviceId;
		this.deviceName = deviceName;
	}
	
	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public static Device getDeviceObject() {
		if (device == null) {
			synchronized (Device.class) {
				return new Device("1", "Sensor1");
			}
		}
		return device;
	}
}
