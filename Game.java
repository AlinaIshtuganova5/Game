public class Game {

    SmartPlayer smartplayer = new SmartPlayer();
    StupidPlayer stupidplayer = new StupidPlayer();
    int draw = 0;

    public void start(int tryCount) {
        turn(tryCount);
        System.out.println("Smart player score - " + smartplayer.getScore());
        System.out.println("Stupid player score -  " + stupidplayer.getScore());
        System.out.println("Draw - " + draw);
    }

    private void turn(int tryCount) {
        for (int i =0; i < tryCount; i++) {
            int winner = Figure.compare(smartplayer.showFigure(), stupidplayer.showFigure());
            if (winner == 1) {
                smartplayer.score++;
            }
            else if (winner == 2){
                stupidplayer.score++;
            }
            else {
                draw++;
            }
        }
    }
}
