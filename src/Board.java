public class Board {
	int currentTurn = 0;
	int totalPlayer = 0;
	Player[] players;
	
	public Board(int totalPlayer) {
		players = new Player[totalPlayer];
		this.totalPlayer = totalPlayer;
		for(int i = 0;i < players.length;i++){
			players[i] = new Player();
		}
	}
	
	public void movePlayer(Player player, int face) {
	}
	
	public Player getCurrentPlayer() {
		return players[currentTurn];
	}
	
	public void nextTurn() {
	}
	
	public Player[] getPlayers() {
		return players;
	}
}
