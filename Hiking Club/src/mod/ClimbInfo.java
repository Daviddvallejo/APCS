package mod;

public class ClimbInfo {
	//Variable for the mountain name
	private final String peak;
	//variable for the time it takes to climb
	private final int time;
	//variable for the climber's name
	private final String name;
	//constructor that sets the above variables to the inputed parameters
	public ClimbInfo(String peak, int time, String name){
			this.peak = peak;
			this.time = time;
			this.name = name;
	}
	//all methods below are getter methods
	public String getName(){
		return name;
	}
	public int getTime(){
		return time;
	}
	public String getPeak(){
		return peak;
	}
}
