public class JailSquare extends Square {
	public JailSquare(String name) {
		super(name);
	}
	
	@Override
	public void doAction(Player player, Board board) {
		Util.print(player, player.getName() + " has been Jail and lost 500 money");
		player.getMoney().substractMoney(500);
	}
}
