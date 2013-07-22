public class Board {
	int currentTurn = 0;
	int totalPlayer = 0;
	Player[] players;
	Square[] squares = new Square[40];
	
	public Board(int totalPlayer) {
		players = new Player[totalPlayer];
		this.totalPlayer = totalPlayer;
		for(int i = 0;i < players.length;i++){
			players[i] = new Player(i, "Player " + (i + 1));
		}
		for(int i = 0;i < squares.length;i++){
			if(i == 0){
				squares[i] = new Square("GO");
			}else if(i == 9){
				squares[i] = new Square("Jail");
			}else if(i == 19){
				squares[i] = new Square("Vacation");
			}else if(i == 29){
				squares[i] = new Square("Fortune");
			}else{
				squares[i] = new Square("Square " + i);
			}
		}
	}
	
	public void movePlayer(Player player, int face) {
		player.setPosition(normalizePosition(player.getCurrentPosition() + face));
		System.out.println("[Turn " + (player.getTotalWalk() + 1) + "] " + player.getName() + " goes to " + squares[player.getCurrentPosition()].getName());
		player.nextTurn();
	}
	
	public int normalizePosition(int position) {
		return position % squares.length;
	}
	
	public Player getCurrentPlayer() {
		return players[currentTurn];
	}
	
	public Player[] getPlayers() {
		return players;
	}
	
	public void nextTurn() {
		if(++currentTurn >= players.length){
			currentTurn = 0;
		}
	}
}
