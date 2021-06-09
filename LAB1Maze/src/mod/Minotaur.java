package mod;
//This class outlines the minotaur and its capabilities
public class Minotaur {
	//gives position
	private int _row, _col;
	//tells if the minotaur is alive 
	
	private boolean _isAlive;
	
	public int getRow() { return _row; }
	public int getCol() { return _col; }
	public void setPos(int r, int c) { _row = r; _col = c; }
	//constructor that determines the minotaur position
	public Minotaur(int r, int c) {
		_row = r;
		_col = c;
		_isAlive = true;
	}
	//tells if the minotaur is alive or dead
	public boolean isAlive() { return _isAlive; }
	//kills the minotaur
	public void kill() {_isAlive = false;}
}
