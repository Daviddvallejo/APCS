package mod;

import java.util.ArrayList;

public class MasterOrder {
	//creates an arrayList of cookieOrders
	private ArrayList<CookieOrder> orders;
	//constructor
	public MasterOrder(){
		orders = new ArrayList<CookieOrder>();
	}
	//Adds an order to the arrayList
	public void addOrder(CookieOrder userOrder){
		orders.add(userOrder);
	}
	//removes all orders of a certain variety
	public int removeVariety(String cookieVar){
		int boxesRemoved = 0;
		for(int i = 0; i < orders.size(); i++){
			if(orders.get(i).getVariety().equalsIgnoreCase(cookieVar)){
				boxesRemoved += orders.get(i).getNumBoxes();
				orders.remove(i);
				i--;
			}
		}
		return boxesRemoved;
	}
	//removes all orders of a certain Buyer
	public int removeBuyer(String cookieBuy){
		int boxesRemoved = 0;
		for(int i = 0; i < orders.size(); i++){
			if(orders.get(i).getBuyer().equalsIgnoreCase(cookieBuy)){
				boxesRemoved += orders.get(i).getNumBoxes();
				orders.remove(i);
				i--;
			}
		}
		return boxesRemoved;
	}
	//removes a specific order by inputting the variety and buyer
	public int removeOrder(String variety, String buyer){
		int boxesRemoved = 0;
		for(int i = 0; i < orders.size(); i++){
			if(orders.get(i).getBuyer().equalsIgnoreCase(buyer) && orders.get(i).getVariety().equalsIgnoreCase(variety) ){
				boxesRemoved += orders.get(i).getNumBoxes();
				orders.remove(i);
				i--;
			}
		}
		return boxesRemoved;
	}
	//gets the total boxes of a certain variety
	public int getVarietyBoxes(String cookieVar){
		int totalBoxes = 0;
		for(int i = 0; i < orders.size(); i++){
			if(orders.get(i).getVariety().equalsIgnoreCase(cookieVar)){
				totalBoxes += orders.get(i).getNumBoxes();
			}
		}
		return totalBoxes;
	}
	//prints the arrayList
	public String printOrder(){
		String ord ="";
		
		for(int i = 0; i < orders.size(); i++){
			ord += "\n" + orders.get(i).getNumBoxes() + " boxes of " + orders.get(i).getVariety() + " ordered by " + orders.get(i).getBuyer();
		}
		return ord;
	}
	//Gets the number of boxes ordered by a certain buyer
	public String ordersByBuyer(String s)
    {
        String blank = "";

        for(int i = 0; i < orders.size(); i++)
        {
            if(orders.get(i).getBuyer().equalsIgnoreCase(s))
            {
                blank += "\n" + orders.get(i).getNumBoxes() + " boxes of " + orders.get(i).getVariety() + " ordered by " + orders.get(i).getBuyer();
            }
        }
        return blank;
    }
}
