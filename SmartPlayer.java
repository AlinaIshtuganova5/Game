public class SmartPlayer extends Player{

    @Override
    public Figure showFigure() {
        Figure figure = null;
        int rndFigure = (int)(Math.random() * 3);
        if (rndFigure == 0) {
            figure = Figure.STONE;
        }
        if (rndFigure == 1) {
            figure = Figure.PAPER;
        }
        if (rndFigure == 2) {
            figure = Figure.SCISSORS;
        }
        return figure;
    }
}
