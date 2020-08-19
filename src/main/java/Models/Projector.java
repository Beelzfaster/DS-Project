package Models;

public class Projector {
	private String appliance, applianceName;
	private boolean on;
	private int volume;
	private int channel;
	
	public Projector() {
		this.appliance = "Projector";
		this.on = true;
		this.applianceName = "Projector Name";
		this.volume = 50;
		this.channel = 5;
	}

	public String getAppliance() {
		return appliance;
	}

	public void setAppliance(String appliance) {
		this.appliance = appliance;
	}

	public String getApplianceName() {
		return applianceName;
	}

	public void setApplianceName(String applianceName) {
		this.applianceName = applianceName;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}
	

}
