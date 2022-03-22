package com.amelin.tictactoe;

public class CheckResult {
    private final Score score;
    private final int[] winComb;

    public CheckResult(Score score, int[] winComb) {
        this.score = score;
        this.winComb = winComb;
    }

    public Score getScore() {
        return score;
    }

    public int[] getWinComb() {
        return winComb;
    }
}
