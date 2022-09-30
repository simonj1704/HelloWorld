package stensaksogpapir;

public class TestStenSaksOgPapir {
    public void run(){
        Game game = new Game();

        game.play();
        boolean keepRunning = true;
        do {
            game.setchoices();
            game.checkWinner();
            System.out.println("You used " + game.translateChoice() +
                    " and the computer used " + game.translateComChoice());
            System.out.println();
            if(game.getPlayerRoundsWon() == 3){
                keepRunning = false;
            }
            if (game.getComRoundsWon() == 3){
                keepRunning = false;
            }
        } while (keepRunning);
        game.winner();
    }
    public static void main(String[] args) {
        TestStenSaksOgPapir testStenSaksOgPapir = new TestStenSaksOgPapir();
        testStenSaksOgPapir.run();
    }
}
