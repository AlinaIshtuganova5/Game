public enum Figure {
    STONE, PAPER, SCISSORS;

    public static int compare(Figure figure1, Figure figure2) {
        int winner = 0;
        if ((figure1 == STONE) && (figure2 == PAPER)) {
            winner = 2;
        }
        if ((figure1 == STONE) && (figure2 == SCISSORS)) {
            winner = 1;
        }
        if ((figure1 == PAPER) && (figure2 == SCISSORS)) {
            winner = 2;
        }
        if ((figure1 == PAPER) && (figure2 == STONE)) {
            winner = 1;
        }
        if ((figure1 == SCISSORS) && (figure2 == STONE)) {
            winner = 2;
        }
        if ((figure1 == SCISSORS) && (figure2 == PAPER)) {
            winner = 1;
        }
        return winner;
    }
}
