package mod;
//outlines what a log message has, with a machine id and description
public class LogMessage {
	private final String machineId;
	private final String description;
		 
	public String getMachineId() {
		return machineId;
	}

	public String getDescription() {
		return description;
	}

	public LogMessage(String id, String description) {
		this.machineId = id;
		this.description = description;
	}
	
}