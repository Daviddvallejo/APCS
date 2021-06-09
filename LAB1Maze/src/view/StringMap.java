package view;

import mod.Maze;
import mod.Minotaur;
import mod.Player;
import mod.Sword;

public class StringMap {

	//These variables all outline certain aspects of the maze, detailing walls, paths, obstacles,
	//useful items, and the player.
	private final String _wall = "o";
	private final String _path = "x";
	private final String _ply = "P";
	private final String _min = "M";
	private final String _exit = "E";
	private final String _space = "     ";
	private final String _swor = "S";
	private Maze _maze;
	private Player _plyr;
	private Minotaur _mint;
	private Sword _swo;
	//Constructor to define the parameters.
	public StringMap(Maze m, Player p, Minotaur t, Sword d) {
		_maze = m;
		_plyr = p;
		_mint = t;
		_swo = d;
	}
	//This method uses 2 for loops to generate the maze
	public String generateMap() {
		 String map = "";
		 for(int r = 0; r < _maze.getMaze().length; r++) {
			 for(int c = 0; c < _maze.getMaze()[0].length; c++) {
				 if(_plyr.getRow() == r && _plyr.getCol() == c) {
					 map += _ply + _space;
				 }
				 else if(_mint.getRow() == r && _mint.getCol() == c) {
					 map += _min + _space; 
				 }
				 else if(_swo.getRow() == r && _swo.getCol() == c) {
					 map += _swor + _space; 
				 }
				 else if(_maze.getExit()[0] == r && _maze.getExit()[1] == c) {
					 map += _exit + _space; 
				 }
				 else if(_maze.getMaze()[r][c]) {
					 map += _path + _space;
				 }
				 else {
					map += _wall + _space; 
				 }
			 }
			 map += "\n";
		 }
		 map += "\n";
		
		 
		 
		 
		 
		 return map;
	}
//this method generates the map when the sword is picked up
public String generateMapS() {
	 String map = "";
	 for(int r = 0; r < _maze.getMaze().length; r++) {
		 for(int c = 0; c < _maze.getMaze()[0].length; c++) {
			 if(_plyr.getRow() == r && _plyr.getCol() == c) {
				 map += _ply + _space;
			 }
			 else if(_mint.getRow() == r && _mint.getCol() == c) {
				 map += _min + _space; 
			 }
			 else if(_maze.getExit()[0] == r && _maze.getExit()[1] == c) {
				 map += _exit + _space; 
			 }
			 else if(_maze.getMaze()[r][c]) {
				 map += _path + _space;
			 }
			 else {
				map += _wall + _space; 
			 }
		 }
		 map += "\n";
	 }
	 map += "\n";
	
	 
	 
	 
	 
	 return map;
	}
//This method generates the map once the minotaur is dead
public String generateMapT() {
	 String map = "";
	 for(int r = 0; r < _maze.getMaze().length; r++) {
		 for(int c = 0; c < _maze.getMaze()[0].length; c++) {
			 if(_plyr.getRow() == r && _plyr.getCol() == c) {
				 map += _ply + _space;
			 }
			 else if(_maze.getExit()[0] == r && _maze.getExit()[1] == c) {
				 map += _exit + _space; 
			 }
			 else if(_maze.getMaze()[r][c]) {
				 map += _path + _space;
			 }
			 else {
				map += _wall + _space; 
			 }
		 }
		 map += "\n";
	 }
	 map += "\n";
	
	 
	 
	 
	 
	 return map;
	}

}
