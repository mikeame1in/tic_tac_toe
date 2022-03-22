package com.amelin.tictactoe;

import javax.swing.*;

public class Ai {
    int bestScore = Integer.MIN_VALUE;
    int bestMove = -1;

    public void nextTurn(JButton[] buttons) {
        for (int i = 0; i < 9; i++) {
            if (buttons[i].getText() == "") {
                buttons[i].setText("O");
                int score = minimax(buttons, 0, false);
                buttons[i].setText("");
                if (score > bestScore) {
                    bestScore = score;
                    bestMove = i;
                }
            }
        }
        buttons[bestMove].setText("O");
        bestScore = Integer.MIN_VALUE;
    }

    private int minimax(JButton[] buttons, int depth, boolean isMaximizing) {
        CheckResult result = WinValidator.check(buttons);
        if (result != null) {
            return result.getScore().getVal();
        }

        if (isMaximizing) {
            int bestScore = Integer.MIN_VALUE;
            for (int i = 0; i < 9; i++) {
                if (buttons[i].getText() == "") {
                    buttons[i].setText("O");
                    int score = minimax(buttons, depth + 1, false);
                    buttons[i].setText("");
                    bestScore = Math.max(score, bestScore);
                }
            }
            return bestScore;
        } else {
            int bestScore = Integer.MAX_VALUE;
            for (int i = 0; i < 9; i++) {
                if (buttons[i].getText() == "") {
                    buttons[i].setText("X");
                    int score = minimax(buttons, depth + 1, true);
                    buttons[i].setText("");
                    bestScore = Math.min(score, bestScore);
                }
            }
            return bestScore;
        }
    }
}
