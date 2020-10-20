package Movies;

class Movie {
	private String name;
	public Movie(String name) {		
		this.name = name;
	}
	public String plot () {
		return "No plot here";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

class Jaws extends Movie{
	public Jaws() {
		super ("Jaws");
	}
	public String plot() {
		return "A shart eats lots of people";
	}
}

class IndependenceDay extends Movie
{
	
public IndependenceDay() {
		super("Independence day");
	}
	
	@Override
	public String plot() {
		// TODO Auto-generated method stub
		return "Aliens attempt to take over planet Earth";
	}
}

class MazeRunner extends Movie{	
	public MazeRunner() {
		super("Maze Runner");
		// TODO Auto-generated constructor stub
	}	
	@Override
	public String plot() {
		// TODO Auto-generated method stub
		return "Kids try and escape a maze";
	}
}

class Forgetable extends Movie{
	public Forgetable() {
		super ("Forgetable");
	}	
}

