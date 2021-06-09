package mod;
//This class outlines the player and its capabilities
public class Player {
	
	private int _row, _col;
	private boolean _isAlive;
	private boolean _hasSword;
	
	public int getRow() { return _row; }
	public int getCol() { return _col; }
	public void setPos(int r, int c) { _row = r; _col = c; }
	
	//sets the player's position
	public Player(int r, int c) {
		_row = r;
		_col = c;
		_isAlive = true;
		_hasSword = false;
	}
	//returns the state of the player, alive or dead
	public boolean isAlive() { return _isAlive; }
	//kills the player
	public void kill() { _isAlive = false; }
	//returns if the player has the sword
	public boolean hasSword() { return _hasSword; } 
	//gives the player the sword
	public void giveSword() { _hasSword = true; }
	//takes the sword from the player
	public void takeSword() { _hasSword = false;}
}