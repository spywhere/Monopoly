import java.util.Scanner;

public class Monopoly {
	Die die = new Die();
	Board board;
	
	public Monopoly(int totalPlayer) {
		board = new Board(totalPlayer);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int totalPlayer = 0;
		while (totalPlayer < 2 || totalPlayer > 8){
			System.out.print("Total Player: ");
			totalPlayer = scanner.nextInt();
		}
		scanner.close();
		Monopoly game = new Monopoly(totalPlayer);
		game.startGame();
	}
	
	public void startGame() {
		System.out.println("Game start!");
		while (!isGameEnd()){
			int face = board.getCurrentPlayer().tossDie(die);
			board.movePlayer(board.getCurrentPlayer(), face);
			board.nextTurn();
		}
		System.out.println("Game over!");
	}
	
	public boolean isGameEnd() {
		for(Player player:board.getPlayers()){
			if(player.getTotalWalk() < 20){ return false; }
		}
		return true;
	}
}
