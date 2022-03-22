package com.amelin.tictactoe;

public enum Score {
    X(-10), O(10), TIE(0);

    private int val;

    Score(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }
}
