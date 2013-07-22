public class Player {
	int totalWalk = 0;
	int position = 0;
	int id;
	String name;
	
	public Player(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getTotalWalk() {
		return totalWalk;
	}
	
	public int tossDie(Die die) {
		int face = die.getFace();
		System.out.println(getName() + " toss a die... Face is " + face);
		return face;
	}
	
	public int getCurrentPosition() {
		return position;
	}
	
	public void setPosition(int position) {
		this.position = position;
		totalWalk++;
	}
	
	public String getName() {
		return name;
	}
}
