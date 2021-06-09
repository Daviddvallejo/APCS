package mod;

public class Maze {
	//This creates a 3d array that contains the boundaries for all 3 available mazes
	private boolean[][][] _mazeList = {		{

		{false,		false, 	true, 	false, 	false, 	false, 	false, 	false, 	false, 	false},
		{false,		false, 	true, 	false, 	true, 	true, 	true, 	false, 	false, 	false},
		{false,		false, 	true, 	true, 	true, 	false, 	true, 	false, 	false, 	false},
		{false,		false, 	true, 	false, 	true, 	true, 	true, 	false, 	false, 	false},
		{false,		false, 	true, 	false, 	false, 	false, 	false, 	true, 	true, 	true},
		{true,		true, 	true, 	true, 	true, 	true, 	true, 	true, 	false, 	true},
		{false,		false, 	true, 	false, 	false, 	false, 	false, 	true, 	true, 	true},
		{false,		false, 	true, 	false, 	false, 	false, 	false, 	false, 	false, 	false},
		{false,		false, 	true, 	false, 	false, 	false, 	false, 	false, 	false, 	false},
		{false,		false, 	false, 	false, 	false, 	false, 	false, 	false, 	false, 	false}
		},
		{
			{false,		true, 	false, 	false, 	false, 	false, 	false, 	false, 	false, 	false},
			{false,		true, 	true, 	true, 	false, 	false, 	false, 	false, 	false, 	false},
			{false,		true, 	false, 	true, 	true, 	true, 	true, 	false, 	true, 	true},
			{false,		true, 	false, 	true, 	false, 	false, 	true, 	false, 	true, 	false},
			{true,		true, 	false, 	true, 	true, 	true, 	true, 	true, 	true, 	false},
			{false,		true, 	false, 	true, 	false, 	true, 	false, 	false, 	true, 	false},
			{false,		true, 	true, 	true, 	false, 	true, 	false, 	false, 	true, 	true},
			{false,		false, 	false, 	false, 	false, 	true, 	false, 	false, 	false, 	false},
			{false,		false, 	false, 	false, 	false, 	true, 	false, 	false, 	false, 	false},
			{false,		false, 	false, 	false, 	false, 	false, 	false, 	false, 	false, 	false}
			},
			{
				{true,		true, 	true, 	true, 	false, 	false, 	false, 	false, 	true, 	false},
				{true,		false, 	false, 	true, 	false, 	false, 	false, 	false, 	true, 	false},
				{true,		false, 	false, 	true, 	false, 	false, 	true, 	true, 	true, 	false},
				{true,		true, 	true, 	true, 	true, 	true, 	true, 	false, 	false, 	false},
				{false,		true, 	false, 	true, 	false, 	false, 	true, 	true, 	true, 	false},
				{false,		true, 	true, 	true, 	false, 	false, 	true, 	false, 	true, 	false},
				{false,		false, 	false, 	true, 	false, 	true, 	true, 	false, 	true, 	false},
				{false,		false, 	false, 	true, 	false, 	false, 	true, 	false, 	true, 	true},
				{false,		false, 	false, 	true, 	true, 	true, 	true, 	false, 	false, 	false},
				{false,		false, 	false, 	false, 	false, 	false, 	false, 	false, 	false, 	false}
				}};
	//gives the start locations for all available player start locations
	private int[][] _plyStartLocations = {  {0,2},
											{0,1},
											{0,0}};
	//gives the start locations for the minotaur
	private int[][] _minStartLocations = {	{5,9},
											{3,6},
											{5,2}};
	//gives the exit locations
	private int[][] _exit = {	{5,0},
								{2,9},
								{0,8}};
	//gives the sword locations
	private int[][] _sword = {	{1,6},
								{6,9},
								{7,9}};
	
	// currentLocations
	int i;
	public boolean[][] getMaze() { return _mazeList[i]; }
	public int[] getPlyStart() { return _plyStartLocations[i]; }
	public int[] getMinStart() { return _minStartLocations[i]; }
	public int[] getExit() { return _exit[i]; }
	public int[] getSworStart() { return _sword[i]; }
	public String mazeNum;
	//This method changes the displayed maze
	public boolean setCurMaze(String mazeNum){
		if(mazeNum.equals("1")){
			i = 0;
			return true;
		}
		else if(mazeNum.equals("2")){
			i = 1;
			return true;
		}
		else if(mazeNum.equals("3")){
			i = 2;
			return true;
		}
		else{
			return false;
		}
			
	}
}