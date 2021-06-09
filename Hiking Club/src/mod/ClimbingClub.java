package mod;

import java.util.ArrayList;
import cont.JOP;
//This class creates an arrayList for the climbing club and has several methods to manipulate the arrayList and gather information from it
public class ClimbingClub {
	//creates a climbInfo arrayList
	public ArrayList<ClimbInfo> climbList = new ArrayList<ClimbInfo>();
	//This method adds a climb to the arrayList, using the peakName, climbTime, and name of climber
	public void addClimb(String peakName, int climbTime, String name) {
		for (int i = 0; i < this.climbList.size(); i++) {
			if (name.compareTo(this.climbList.get(i).getName()) <= 0) {
				this.climbList.add(i, new ClimbInfo(peakName, climbTime, name));
				return;
			}
		}
		this.climbList.add(new ClimbInfo(peakName, climbTime, name));
	}
	//this method gets the number of unique peak names
	public int distinctPeakNames() {
		if (climbList.isEmpty()) {
			return 0;
		}
		ClimbInfo currInfo = climbList.get(0);
		String prevName = currInfo.getName();
		String currName = null;
		int numNames = 1;
		for (int k = 1; k < climbList.size(); k++) {
			currInfo = climbList.get(k);
			currName = currInfo.getName();
			if (prevName.compareTo(currName) != 0) {
				numNames++;
				prevName = currName;
			}
		}
		return numNames;
	}
	//This method prints the climb list
	public String printList() {
		String list = "";
		for (int i = 0; i < climbList.size(); i++) {
			list += "\n" + climbList.get(i).getName() + " hiked "
					+ climbList.get(i).getPeak() + " for "
					+ climbList.get(i).getTime() + " hours.";
		}
		return list;
	}
	//This method takes a string input and removes all climb's with that hikers name
	public void removeHiker(String hiker) {
		for (int i = 0; i < climbList.size(); i++) {
			if (climbList.get(i).getName().equalsIgnoreCase(hiker)) {
				climbList.remove(i);
				i--;
			}
		}
	}
	//This method gets the total duration for all hikes for a certain hiker
	public int hikerDuration(String h) {
		int duration = 0;
		for (int i = 0; i < climbList.size(); i++) {
			if (climbList.get(i).getName().equalsIgnoreCase(h)) {
				duration += climbList.get(i).getTime();
			}
		}
		return duration;
	}
	//This method gets the duration for all hikes at a specific location
	public int locationDuration(String location) {
		int duration = 0;
		for (int i = 0; i < climbList.size(); i++) {
			if (climbList.get(i).getPeak().equalsIgnoreCase(location)) {
				duration += climbList.get(i).getTime();
			}
		}
		return duration;
	}
	//prints the amount of time a hiker has hiked
	public String printHikerList(String hiker) {
		String list = "";
		list += "\n" + hiker + " hiked for " + hikerDuration(hiker) + " hours.";
		return list;
	}
	//prints the amount of time that a location has been hiked
	public String printLocationList(String location) {
		String list = "";
		list += "\n" + location + " was hiked for "
				+ locationDuration(location) + " hours.";
		return list;
	}



}
