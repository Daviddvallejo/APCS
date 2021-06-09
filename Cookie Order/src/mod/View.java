package mod;

import cont.JOP;

public class View {
	//masterOrder variable
	private MasterOrder _m;
	//constructor, creates a new MasterOrder and runs the program
	public View(){
		
		_m = new MasterOrder();
		update();
	}
	//updates the master order
	public void update(){
		while(true){
			//initial input with text
			boolean on = true;
			String order = _m.printOrder().trim();
			String msg = ("Welcome to the Girl Scout Cookie Order!" + "\n");
			String msg2 = ("\n" + "Commands:" + "\n" + "Order: To place an order" + "\n" + "Remove Variety: To remove any orders of said variety" + "\n" + "Remove Buyer: To remove any orders by a specific buyer" + "\n" + "Remove Order: To remove a singular, specific order" + "\n" + "Buyer: To display orders by Buyer" + "\n" + "Exit: To exit the program and finish shopping");
			String total1 = ("\n" + "Boxes of Samoas ordered: " + _m.getVarietyBoxes("Samoas"));
			String total2 = ("Boxes of Thin Mints ordered: " + _m.getVarietyBoxes("ThinMints"));
			String total3 = ("Boxes of Tagalongs ordered: " + _m.getVarietyBoxes("Tagalongs"));
			String input = JOP.in(msg + order + "\n" + total1 + "\n" + total2 + "\n" + total3 + "\n"  + msg2);
			while(on){
				if (input == null) {
					JOP.msg("Thank you for shopping!");
					System.exit(0);
				};
				input = input.trim();
				//If input is order, then brings user to the order screen
				if(input.equalsIgnoreCase("Order")) {
					String clientOrder = JOP.in("What would you like to order?" + "\n" + order + "\n" + "\n" + "Current varieties are: Samoas, ThinMints, and Tagalongs" + "\n" + "Please enter the variety you'd like, the number of boxes, and your name" + "\n" + "(please do not use commas, simply put a space in between each field)");
					String _variety = null;

					if (clientOrder == null) {
						update();
						return;
					}

					String[] args = clientOrder.split(" ");
					if (args.length != 3) {
						JOP.msg("please enter a valid order");
						update();
						return;
					}

					String _pam1 = args[0];
					String _pam2 = args[1];
					String _pam3 = args[2];

					if (!_pam1.toLowerCase().contains("thinmints") && !_pam1.toLowerCase().contains("samoas") && !_pam1.toLowerCase().contains("tagalongs")) {
						JOP.msg("please enter a valid order");
						update();
						return;
					}

					if (isParsable(_pam2) == false) {
						JOP.msg("please enter a valid order");
						update();
						return;
						//adds the order if all parameters are inputted properly
					} else if (_pam1.equalsIgnoreCase("ThinMints") || _pam1.equalsIgnoreCase("Samoas") || _pam1.equalsIgnoreCase("Tagalongs")) {
						_variety = _pam1;
						_m.addOrder(new CookieOrder(_variety, Integer.parseInt(_pam2), _pam3));
					} else {
						JOP.msg("please enter a valid order");
						update();
						return;
					}
				}
				//allows the user to remove a certain variety 
				else if(input.equalsIgnoreCase("Remove Variety")){
					String remove = JOP.in("What variety would you like to remove?" + "\n" + order + "\n"  + "\n" + "Current varieties are: Samoas, ThinMints, and Tagalongs");
					if (remove == null) {
						update();
						return;
					}
					//removes the variety
					if(remove.equalsIgnoreCase("ThinMints")||remove.equalsIgnoreCase("Samoas")||remove.equalsIgnoreCase("Tagalongs")){
						_m.removeVariety(remove);
					}
				}
				//allows the user to remove a buyer
				else if(input.equalsIgnoreCase("Remove Buyer")){
					String remove = JOP.in("What buyer would you like to remove?" + "\n" + order );
					if (remove == null) {
						update();
						return;
					}
					_m.removeBuyer(remove);
				}
				//allows the user to remove a specific order
				else if(input.equalsIgnoreCase("Remove order")){
					String remove = JOP.in("What order would you like to remove?" + "\n" + order + "\n" + "\n"  + "(please enter the variety then the buyer, separated by a space)");
					if (remove == null) {
						update();
						return;
					}
					String _v = remove.substring(0,remove.indexOf(' '));
					String _b = remove.substring(remove.indexOf(' ')+1, remove.length());
					_m.removeOrder(_v, _b);
				}
				//allows the user to exit the program
				else if(input.equalsIgnoreCase("exit")){
					JOP.msg("Thank you for shopping!");
					System.exit(0);
				}
				//allows the user to display orders by buyer
				else if(input.equalsIgnoreCase("Buyer")){
					String buyer = JOP.in("Please enter the name of the buyer whose orders you would like to list" + "\n" + order);
					if (buyer == null) {
						update();
						return;
					}
					String buyerOrder = _m.ordersByBuyer(buyer);
					if (buyerOrder == null || buyerOrder.length() == 0) JOP.msg("please enter a valid name");
					else JOP.msg(buyerOrder);
				}
				else{
					JOP.msg("Please enter a valid command");
				}
				on = false;
			}
		}
	} 
	//checks if the inputted string is an integer
	public static boolean isParsable(String input) {
	    try {
	        Integer.parseInt(input);
	        return true;
	    } catch (final NumberFormatException e) {
	        return false;
	    }
	}
}	