package mod;

import cont.JOP;
import view.StringMap;

public class World<_w> {

	private Player _p;
	private Minotaur _t;
	private Maze _m;
	private StringMap _s;
	private Sword _d;
	public int steps = 0;
	public int selectedMap = 0;
	
	public World() {
		_m = new Maze();
		// startROW startCOL
		_p = new Player(_m.getPlyStart()[0], _m.getPlyStart()[1]);
		_t = new Minotaur(_m.getMinStart()[0], _m.getMinStart()[1]);
		_d = new Sword(_m.getSworStart()[0], _m.getSworStart()[1]);
		_s = new StringMap(_m, _p, _t, _d);
		update();
	}
	//updates the program and runs it
	public void update() {
		JOP.msg("Welcome to the maze game!" + "\n" + "To win, you must reach the exit" + "\n" + "However, there will be a Minotaur chasing you and if it catches you, it will kill you" + "\n" + "This can be avoided by finding the Sword and slaying the Minotaur instead" + "\n" + "Good luck and have fun!");
		boolean isPlaying = true;
		while (isPlaying) {
			boolean on = true;
			// Get the Map
			String map = _s.generateMap();
			String mapS = _s.generateMapS();
			String mapT = _s.generateMapT();
			String msg = "Use WASD to move" + "\n" + "Use 1, 2, or 3 to cycle between maps at any time" + "\n" + "WARNING: Switching maps will cause progress in current map to be lost" + "\n" + "What would you like to do?";

			while (on) {
				// Get the player move
				if(_p.hasSword() == false){
					
					String input = JOP.in(map + msg);
					if (getPlayerMove(input)) {
						on = false;
					}
					else if (_m.setCurMaze(input)){
						_p.setPos(_m.getPlyStart()[0],_m.getPlyStart()[1] );
						_t.setPos(_m.getMinStart()[0],_m.getMinStart()[1] );
						_d.setPos(_m.getSworStart()[0],_m.getSworStart()[1] );
						steps = 0;
						on = false;
					}		
					else if(input == null) {

					}				
				}
				else if(_p.hasSword() == true){
					String input = JOP.in(mapS + msg);
					if (getPlayerMove(input)) {
						on = false;
					}
					else if (_m.setCurMaze(input)){
						_p.setPos(_m.getPlyStart()[0],_m.getPlyStart()[1] );
						_t.setPos(_m.getMinStart()[0],_m.getMinStart()[1] );
						_d.setPos(_m.getSworStart()[0],_m.getSworStart()[1] );
						_p.takeSword();
						steps = 0;
						on = false;
						
					}		
					else if(input == null) {

					}	
				}
				else if(_t.isAlive() == false){
					String input = JOP.in(mapT + msg);
					if (getPlayerMove(input)) {
						on = false;
					}
					else if (_m.setCurMaze(input)){
						_p.setPos(_m.getPlyStart()[0],_m.getPlyStart()[1] );
						_t.setPos(_m.getMinStart()[0],_m.getMinStart()[1] );
						_d.setPos(_m.getSworStart()[0],_m.getSworStart()[1] );
						_p.takeSword();
						steps = 0;
						on = false;
					}		
					else if(input == null) {

					}	
				}

			}
			if (pickupSword()){
				_p.giveSword();
			}
			if(_p.hasSword() == true && death() == true ){
				_t.kill();
			}
			// check for victory
			if (victory()) {
				isPlaying = false;
				JOP.msg("Congrats victory!");
				JOP.msg("Steps taken: " + steps);
			}
			// move the minotaur
			moveMinotaur();
			
			// check for death
			if(death() == true && _p.hasSword() == false) {
				isPlaying = false;
				JOP.msg("Wow what a loser. You suck. You lost.");
				JOP.msg("Steps taken: " + steps);
			}
		}
	
		
	}

	// change to getPlayerMove(String s) change to private.
	private boolean getPlayerMove(String s) {

		// Moving North
		if (s.equalsIgnoreCase("W")) {
			if ((_p.getRow() - 1) >= 0 && _m.getMaze()[_p.getRow() - 1][_p.getCol()]) {
				steps++;
				_p.setPos(_p.getRow() - 1, _p.getCol());
				return true;
			} else {
				return false;
			}
		}
		// Moving South
		if (s.equalsIgnoreCase("S")) {
			if ((_p.getRow() + 1) < _m.getMaze().length && _m.getMaze()[_p.getRow() + 1][_p.getCol()]) {
				steps++;
				_p.setPos(_p.getRow() + 1, _p.getCol());
				return true;			
			} else {
				return false;
			}
		}
		// Moving East
		if (s.equalsIgnoreCase("D")) {
			if ((_p.getCol() + 1) < _m.getMaze()[0].length && _m.getMaze()[_p.getRow()][_p.getCol() + 1]) {
				steps++;
				_p.setPos(_p.getRow(), _p.getCol() + 1);
				return true;	
			} else {
				return false;
			}
		}
		// Moving West
		if (s.equalsIgnoreCase("A")) {
			if ((_p.getCol() - 1) >= 0 && _m.getMaze()[_p.getRow()][_p.getCol() - 1]) {
				steps++;
				_p.setPos(_p.getRow(), _p.getCol() - 1);
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	//moves the minotaur
	private void moveMinotaur() {
		int rDist = _p.getRow() - _t.getRow();
		int cDist = _p.getCol() - _t.getCol();
		int r = _t.getRow();
		int c = _t.getCol();
		
		// Minotaur moving North
		if(rDist < 0 && _m.getMaze()[r - 1][c]) {
			_t.setPos(r - 1, c);
		}

		// Minotaur moving South.
		if(rDist > 0 && _m.getMaze()[r +1][c]) {
			_t.setPos(r + 1, c);
		}
		// Minotaur moving East
		if(cDist > 0 && _m.getMaze()[r][c + 1]) {
			_t.setPos(r, c + 1);
		}
		// Minotuar moving west
		if(cDist < 0 && _m.getMaze()[r][c - 1]) {
			_t.setPos(r, c - 1);
		}
	}
	//kills the player
	public boolean death() {
		if(_t.getRow() == _p.getRow() &&
				_t.getCol() == _p.getCol()) {
			return true;
		}
		return false;
	}
	//gives victory to the player
	public boolean victory() {
		if (_p.getRow() == _m.getExit()[0] && _p.getCol() == _m.getExit()[1])
			return true;
		return false;
	}
	//has the player pick up the sword
	public boolean pickupSword() {
		if(_d.getRow() == _p.getRow() &&
				_d.getCol() == _p.getCol()) {
			return true;
		}
		return false;
	}

}
