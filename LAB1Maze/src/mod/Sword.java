package mod;
//This class outlines the sword and its capabilities
public class Sword {
	private int _row, _col;
	
	public int getRow() { return _row; }
	public int getCol() { return _col; }
	public void setPos(int r, int c) { _row = r; _col = c; }
	
	public Sword(int r, int c) {
		_row = r;
		_col = c;

	}
}
