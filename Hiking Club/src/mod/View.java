package mod;

import cont.JOP;
import mod.ClimbInfo;
import mod.ClimbingClub;
import java.util.*;

public class View {
	//creates the ClimbingClub variable
	private ClimbingClub _c;
	//creates a money integer and sets it to 0, used to buy plane tickets to different areas
	public int money = 0;
	//the next 8 variables are used to set where in the world the hikers are
	public boolean S = false;
	public boolean Nz = false;
	public boolean T = false;
	public boolean A = false;
	public boolean N = false;
	public boolean P = false;
	public boolean F = false;
	public boolean J = false;
	public boolean Au = false;
	//the next 9 variables set the price of a plane ticket to an area of the world
	public int priceU = 0;
	public int priceS = 1000;
	public int priceNz = 2500;
	public int priceT = 3000;
	public int priceA = 2000;
	public int priceN = 5000;
	public int priceP = 3000;
	public int priceF = 4000;
	public int priceJ = 5000;
	public int priceAu = 5000;

	//constructor, runs the program 
	public View() {
		_c = new ClimbingClub();
		update();
	}
	//This method updates the list, as well as what is displayed on the screen
	//It starts with the hikers in the US, and allows the user to hike for money, and travel to different places using that money.
	private void update() {
		boolean on = true;
		String location = "USA";
		while (on) {
			boolean run = true;
			String msg = "Welcome to the International Hiking Club! You are currently in "
					+ location;
			String msg2 = "\n" + "Here is the current list of hikes performed:"
					+ "\n";
			String list = _c.printList();
			String cmd = "\n"
					+ "\n"
					+ "Please type 'mountain' to see the mountains to hike in your location and 'airport' to travel to a different location to hike"
					+ "\n"
					+ "Type 'hiker' to find the number of hours a certain hiker has hiked"
					+ "\n"
					+ "Type 'location' to find the number of hours a location was hiked."
					+ "\n" + "Type 'remove' to remove a hiker from the list";
			String cmd2 = "\n" + "Type 'exit' at any point to exit the program";
			String hike = "\n"
					+ "Please enter the name of the mountain, time it took to hike (in hours), and your Name";
			String hike2 = "\n"
					+ "(Please follow format: mountain, time, name)";
			String clubMoney = "\n" + "The club has: " + money
					+ " dollars for travel.";
			String back = "\n" + "Type 'back' to go to the previous screen";
			String input = JOP.in(msg + clubMoney + msg2 + list + cmd + cmd2);
			while (run) {
				boolean run2 = true;
				if (input.equalsIgnoreCase("mountain")) {
					if (location.equalsIgnoreCase("USA")) {
						String climb = JOP
								.in("The mountains available to climb in your area are: "
										+ "\n"
										+ "   Mount Hood"
										+ "\n"
										+ "   Pikes Peak"
										+ "\n"
										+ "   Mount Mitchell" + hike + hike2);
						if (!"exit".equalsIgnoreCase(climb)) {
							checkHike(climb);
							run = false;
						} else if (climb.equalsIgnoreCase("exit")) {
							JOP.msg("Thank you!");
							on = false;
							run = false;
						}

					} else if (location.equalsIgnoreCase("Switzerland")) {
						String climb = JOP
								.in("The mountains available to climb in your area are: "
										+ "\n"
										+ "   Gran Paradiso"
										+ "\n"
										+ "   Breithorn"
										+ "\n"
										+ "   Weissmies" + hike + hike2);
						if (!"exit".equalsIgnoreCase(climb)) {
							checkHike(climb);
							run = false;
						} else if (climb.equalsIgnoreCase("exit")) {
							JOP.msg("Thank you!");
							on = false;
							run = false;
						}
					} else if (location.equalsIgnoreCase("New Zealand")) {
						String climb = JOP
								.in("The mountains available to climb in your area are: "
										+ "\n"
										+ "   Mount Tutoko"
										+ "\n"
										+ "   Mitre Peak"
										+ "\n"
										+ "   Aoraki"
										+ hike + hike2);
						if (!"exit".equalsIgnoreCase(climb)) {
							checkHike(climb);
							run = false;
						} else if (climb.equalsIgnoreCase("exit")) {
							JOP.msg("Thank you!");
							on = false;
							run = false;
						}
					} else if (location.equalsIgnoreCase("Tanzania")) {
						String climb = JOP
								.in("The mountains available to climb in your area are: "
										+ "\n"
										+ "   Mount Ararat"
										+ "\n"
										+ "   Azhdahak"
										+ "\n"
										+ "   Mount Armaghan" + hike + hike2);
						if (!"exit".equalsIgnoreCase(climb)) {
							checkHike(climb);
							run = false;
						} else if (climb.equalsIgnoreCase("exit")) {
							JOP.msg("Thank you!");
							on = false;
							run = false;
						}
					} else if (location.equalsIgnoreCase("Armenia")) {
						String climb = JOP
								.in("The mountains available to climb in your area are: "
										+ "\n"
										+ "   Mount Kilimanjaro"
										+ "\n"
										+ "   Mount Meru"
										+ "\n"
										+ "   Mount Kenya" + hike + hike2);
						if (!"exit".equalsIgnoreCase(climb)) {
							checkHike(climb);
							run = false;
						} else if (climb.equalsIgnoreCase("exit")) {
							JOP.msg("Thank you!");
							on = false;
							run = false;
						}
					} else if (location.equalsIgnoreCase("Nepal")) {
						String climb = JOP
								.in("The mountains available to climb in your area are: "
										+ "\n"
										+ "   Mount Everest"
										+ "\n"
										+ "   Lhotse"
										+ "\n"
										+ "   Cho Oyu"
										+ hike + hike2);
						if (!"exit".equalsIgnoreCase(climb)) {
							checkHike(climb);
							run = false;
						} else if (climb.equalsIgnoreCase("exit")) {
							JOP.msg("Thank you!");
							on = false;
							run = false;
						}
					} else if (location.equalsIgnoreCase("Peru")) {
						String climb = JOP
								.in("The mountains available to climb in your area are: "
										+ "\n"
										+ "   Huascaran"
										+ "\n"
										+ "   Alpamayo"
										+ "\n"
										+ "   Nevado Pisco" + hike + hike2);
						if (!"exit".equalsIgnoreCase(climb)) {
							checkHike(climb);
							run = false;
						} else if (climb.equalsIgnoreCase("exit")) {
							JOP.msg("Thank you!");
							on = false;
							run = false;
						}
					} else if (location.equalsIgnoreCase("France")) {
						String climb = JOP
								.in("The mountains available to climb in your area are: "
										+ "\n"
										+ "   Mont Blanc"
										+ "\n"
										+ "   Grandes Jorasses"
										+ "\n"
										+ "   Aiguille Verte" + hike + hike2);
						if (!"exit".equalsIgnoreCase(climb)) {
							checkHike(climb);
							run = false;
						} else if (climb.equalsIgnoreCase("exit")) {
							JOP.msg("Thank you!");
							on = false;
							run = false;
						}
					} else if (location.equalsIgnoreCase("Japan")) {
						String climb = JOP
								.in("The mountains available to climb in your area are: "
										+ "\n"
										+ "   Mount Fuji"
										+ "\n"
										+ "   Mount Hiei"
										+ "\n"
										+ "   Mount Yari" + hike + hike2);
						if (!"exit".equalsIgnoreCase(climb)) {
							checkHike(climb);
							run = false;
						} else if (climb.equalsIgnoreCase("exit")) {
							JOP.msg("Thank you!");
							on = false;
							run = false;
						}
					} else if (location.equalsIgnoreCase("Australia")) {
						String climb = JOP
								.in("The mountains available to climb in your area are: "
										+ "\n"
										+ "   Mount Feathertop"
										+ "\n"
										+ "   Mount Bogong"
										+ "\n"
										+ "   Mount Gower" + hike + hike2);
						if (!"exit".equalsIgnoreCase(climb)) {
							checkHike(climb);
							run = false;
						} else if (climb.equalsIgnoreCase("exit")) {
							JOP.msg("Thank you!");
							on = false;
							run = false;
						}
					}
				} else if (input.equalsIgnoreCase("Airport")) {
					String travelMsg = "The club has: "
							+ money
							+ " dollars for travel."
							+ "\n"
							+ "Once you travel to a country, you may travel to it again at no additional cost."
							+ "\n" + "Choose your destination:" + "\n" + "\n"
							+ "   USA - $" + priceU + "\n"
							+ "   Switzerland - $" + priceS + "\n"
							+ "   New Zealand - $" + priceNz + "\n"
							+ "   Tanzania - $" + priceT + "\n"
							+ "   Armenia - $" + priceA + "\n" + "   Nepal - $"
							+ priceN + "\n" + "   Peru - $" + priceP + "\n"
							+ "   France - $" + priceF + "\n" + "   Japan - $"
							+ priceJ + "\n" + "   Australia - $" + priceAu;
					String travelCmd = "\n" + "\n"
							+ "Please choose your destination";
					String travel = JOP.in(travelMsg + travelCmd + cmd2 + back);
					while (run2) {
						if (location.equals(travel)) {
							JOP.msg("You are already here!");
							run2 = false;
						} else if (travel.equalsIgnoreCase("USA")) {
							location = travel;
							run = false;
							run2 = false;
						} else if (travel.equalsIgnoreCase("Switzerland")) {
							if (S == true) {
								location = travel;
								run = false;
								run2 = false;
							} else {
								if (buyTicket(money, priceS) == false) {
									JOP.msg("You do not have enough money to travel there!");
									run2 = false;
								} else if (buyTicket(money, priceS) == true) {
									location = travel;
									S = true;
									money -= priceS;
									priceS = 0;
									run = false;
									run2 = false;
								}
							}
						} else if (travel.equalsIgnoreCase("New Zealand")) {
							if (Nz == true) {
								location = travel;
								run = false;
								run2 = false;
							} else {
								if (buyTicket(money, priceNz) == false) {
									JOP.msg("You do not have enough money to travel there!");
									run2 = false;
								} else if (buyTicket(money, priceNz) == true) {
									location = travel;
									Nz = true;
									money -= priceNz;
									priceNz = 0;
									run = false;
									run2 = false;
								}
							}
						} else if (travel.equalsIgnoreCase("Tanzania")) {
							if (T == true) {
								location = travel;
								run = false;
								run2 = false;
							} else {
								if (buyTicket(money, priceT) == false) {
									JOP.msg("You do not have enough money to travel there!");
									run2 = false;
								} else if (buyTicket(money, priceT) == true) {
									location = travel;
									T = true;
									money -= priceT;
									priceT = 0;
									run = false;
									run2 = false;
								}
							}
						} else if (travel.equalsIgnoreCase("Armenia")) {
							if (A == true) {
								location = travel;
								run = false;
								run2 = false;
							} else {
								if (buyTicket(money, priceA) == false) {
									JOP.msg("You do not have enough money to travel there!");
									run2 = false;
								} else if (buyTicket(money, priceA) == true) {
									location = travel;
									A = true;
									money -= priceA;
									priceA = 0;
									run = false;
									run2 = false;
								}
							}
						} else if (travel.equalsIgnoreCase("Nepal")) {
							if (N == true) {
								location = travel;
								run = false;
								run2 = false;
							} else {
								if (buyTicket(money, priceN) == false) {
									JOP.msg("You do not have enough money to travel there!");
									run2 = false;
								} else if (buyTicket(money, priceN) == true) {
									location = travel;
									N = true;
									money -= priceN;
									priceN = 0;
									run = false;
									run2 = false;
								}
							}
						} else if (travel.equalsIgnoreCase("Peru")) {
							if (P == true) {
								location = travel;
								run = false;
								run2 = false;
							} else {
								if (buyTicket(money, priceP) == false) {
									JOP.msg("You do not have enough money to travel there!");
									run2 = false;
								} else if (buyTicket(money, priceP) == true) {
									location = travel;
									P = true;
									money -= priceP;
									priceP = 0;
									run = false;
									run2 = false;
								}
							}
						} else if (travel.equalsIgnoreCase("France")) {
							if (F == true) {
								location = travel;
								run = false;
								run2 = false;
							} else {
								if (buyTicket(money, priceF) == false) {
									JOP.msg("You do not have enough money to travel there!");
									run2 = false;
								} else if (buyTicket(money, priceF) == true) {
									F = true;
									money -= priceF;
									priceF = 0;
									location = travel;
									run = false;
									run2 = false;
								}
							}
						} else if (travel.equalsIgnoreCase("Japan")) {
							if (J == true) {
								location = travel;
								run = false;
								run2 = false;
							} else {
								if (buyTicket(money, priceJ) == false) {
									JOP.msg("You do not have enough money to travel there!");
									run2 = false;
								} else if (buyTicket(money, priceJ) == true) {
									location = travel;
									J = true;
									money -= priceJ;
									priceJ = 0;
									run = false;
									run2 = false;
								}
							}
						} else if (travel.equalsIgnoreCase("Australia")) {
							if (Au == true) {
								location = travel;
								run = false;
								run2 = false;
							} else {
								if (buyTicket(money, priceAu) == false) {
									JOP.msg("You do not have enough money to travel there!");
									run2 = false;
								} else if (buyTicket(money, priceAu) == true) {
									location = travel;
									Au = true;
									money -= priceAu;
									priceAu = 0;
									run = false;
									run2 = false;
								}
							}
						} else if (travel.equalsIgnoreCase("exit")) {
							JOP.msg("Thank you!");
							on = false;
							run = false;
							run2 = false;
						} else if (travel.equalsIgnoreCase("back")) {
							run2 = false;
							run = false;
						} else {
							JOP.msg("Please enter a valid input");
							run2 = false;
						}
					}
				} else if (input.equalsIgnoreCase("hiker")) {
					String hikers = JOP
							.in("Which hiker would you like to display");
					if (hikers.equalsIgnoreCase("exit")) {
						JOP.msg("Thank you!");
						on = false;
						run = false;
					} else {
						JOP.msg(_c.printHikerList(hikers));
						run = false;
					}
				} else if (input.equalsIgnoreCase("location")) {
					String locations = JOP
							.in("Which location would you like to display");
					if (locations.equalsIgnoreCase("exit")) {
						JOP.msg("Thank you!");
						on = false;
						run = false;
					} else {
						JOP.msg(_c.printLocationList(locations));
						run = false;
					}
				} else if (input.equalsIgnoreCase("Remove")) {
					String remove = JOP
							.in("Which Hiker would you like to remove");
					if (remove.equalsIgnoreCase("exit")) {
						JOP.msg("Thank you!");
						on = false;
						run = false;
					} else {
						_c.removeHiker(remove);
						run = false;
					}
				} else if (input.equalsIgnoreCase("exit")) {
					JOP.msg("Thank you!");
					on = false;
					run = false;
				} else {
					JOP.msg("Please enter a valid input");
					run = false;
				}
			}
		}
	}
	//This method checks to see if a hike input is valid, as in if it meets the parameters outlined to be a successful hike
	public void checkHike(String s) {
		String _pam1 = s.substring(0, s.indexOf(','));
		String _pam2 = s.substring(s.indexOf(',') + 2,
				s.indexOf(',', s.indexOf(',') + 1));
		String _pam3 = s.substring(s.indexOf(',', s.indexOf(',') + 1) + 2,
				s.length());
		if (isParsable(_pam2) == false) {
			JOP.msg("Please enter a valid input");
		} else if (_pam1.equalsIgnoreCase("Mount Hood")
				|| _pam1.equalsIgnoreCase("Pikes Peak")
				|| _pam1.equalsIgnoreCase("Mount Mitchell")
				|| _pam1.equalsIgnoreCase("Gran Paradiso")
				|| _pam1.equalsIgnoreCase("Breithorn")
				|| _pam1.equalsIgnoreCase("Weissmies")
				|| _pam1.equalsIgnoreCase("Mount Tutoko")
				|| _pam1.equalsIgnoreCase("Mitre Peak")
				|| _pam1.equalsIgnoreCase("Aoraki")
				|| _pam1.equalsIgnoreCase("Mount Ararat")
				|| _pam1.equalsIgnoreCase("Azhdahak")
				|| _pam1.equalsIgnoreCase("Mount Armaghan")
				|| _pam1.equalsIgnoreCase("Mount Kilimanjaro")
				|| _pam1.equalsIgnoreCase("Mount Meru")
				|| _pam1.equalsIgnoreCase("Mount Kenya")
				|| _pam1.equalsIgnoreCase("Mount Everest")
				|| _pam1.equalsIgnoreCase("Lhotse")
				|| _pam1.equalsIgnoreCase("Cho Oyu")
				|| _pam1.equalsIgnoreCase("Huascaran")
				|| _pam1.equalsIgnoreCase("Alpamayo")
				|| _pam1.equalsIgnoreCase("Nevado Pisco")
				|| _pam1.equalsIgnoreCase("Mont Blanc")
				|| _pam1.equalsIgnoreCase("Grandes Jorasses")
				|| _pam1.equalsIgnoreCase("Aiguille Verte")
				|| _pam1.equalsIgnoreCase("Mount Fuji")
				|| _pam1.equalsIgnoreCase("Mount Hiei")
				|| _pam1.equalsIgnoreCase("Mount Yari")
				|| _pam1.equalsIgnoreCase("Mount Feathertop")
				|| _pam1.equalsIgnoreCase("Mount Bogong")
				|| _pam1.equalsIgnoreCase("Mount Gower")) {
			_c.addClimb(_pam1, Integer.parseInt(_pam2), _pam3);
			getMoney(Integer.parseInt(_pam2));
		} else {
			JOP.msg("Please enter a valid input");
		}
	}
	//checks to see if a certain String input is an int as well
	public static boolean isParsable(String input) {
		try {
			Integer.parseInt(input);
			return true;
		} catch (final NumberFormatException e) {
			return false;
		}
	}

	//Gives money based on time hiked
	public int getMoney(int i) {
		money += i * 10;
		return i;
	}
	//This method checks to see if the money owned is greater than the ticket price
	public boolean buyTicket(int a, int b) {
		if (a >= b == true) {
			return true;
		} else {
			return false;
		}
	}
}
