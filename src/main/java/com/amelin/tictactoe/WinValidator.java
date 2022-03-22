package com.amelin.tictactoe;

import javax.swing.*;

public class WinValidator {
    private static final int[][] WIN_COMB =
            {
                    {0, 1, 2}, {3, 4, 5}, {6, 7, 8},
                    {0, 3, 6}, {1, 4, 7}, {2, 5, 8},
                    {0, 4, 8}, {2, 4, 6}
            };

    public static CheckResult check(JButton[] buttons) {
        for (int i = 0; i < 8; i++) {
            int a = WIN_COMB[i][0];
            int b = WIN_COMB[i][1];
            int c = WIN_COMB[i][2];

            if (buttons[a].getText() == "X"
                    && buttons[b].getText() == "X"
                            && buttons[c].getText() == "X") {
                return new CheckResult(Score.X, new int[] {a, b, c});
            }

            if (buttons[a].getText() == "O"
                    && buttons[b].getText() == "O"
                        && buttons[c].getText() == "O") {
                return new CheckResult(Score.O, new int[] {a, b, c});
            }
        }

        return new CheckResult(Score.TIE, new int[] {});
    }
}
