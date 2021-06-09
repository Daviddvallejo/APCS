package mod;
//This class is the basis for a cookie order, outlining parameters
public class CookieOrder {
	//variable for variety
	private String _var;
	//variable for buyer
	private String _buy;
	//variable for number of boxes
	private int _box;
	//gets the variety of the cookie order
	public String getVariety(){
		return _var;
	}
	//gets the number of boxes of the cookie order
	public int getNumBoxes(){
		return _box;
	}
	//gets the name of the buyer of the order
	public String getBuyer(){
		return _buy;
	}
	//creates the constructor 
	CookieOrder(String v, int x, String b){
		_var = v;
		_buy = b;
		_box = x;
	}

}
