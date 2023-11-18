package baseball.view;

import static baseball.utils.Constant.BALL;
import static baseball.utils.Constant.CONTINUE;
import static baseball.utils.Constant.CORRECT_ALL;
import static baseball.utils.Constant.INPUT_NUMBER;
import static baseball.utils.Constant.NOTHING;
import static baseball.utils.Constant.START_GAME;
import static baseball.utils.Constant.STRIKE;

public class OutputView {

    public static void printStart() {
        System.out.println(START_GAME);
    }

    public static void printInput() {
        System.out.println(INPUT_NUMBER);
    }

    public static void printExitOption() {
        System.out.println(CONTINUE);
    }

    public static void printCorrect() {
        System.out.print(CORRECT_ALL);
    }

    public static void printStrike(int strikeCount) {
        System.out.println(strikeCount + STRIKE);
    }

    public static void printBall(int ballCount) {
        System.out.println(ballCount + BALL);
    }

    public static void printNothing() {
        System.out.println(NOTHING);
    }

    public static void printOther(int ballCount, int strikeCount) {
        System.out.println(ballCount + BALL + " " + strikeCount + STRIKE);
    }
}
