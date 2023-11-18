package baseball.view;

import baseball.exception.InvalidInputException;
import baseball.result.Result;
import baseball.baseball.Baseball;

import static baseball.utils.Constant.EXIT;
import static baseball.utils.Constant.INVALID_RESTART_OPTION_NUMBER;
import static baseball.utils.Constant.RESTART;

public class OutputHandler {

    public static void printInput() {
        OutputView.printInput();
    }

    public static void printResult(Result result) {
        Baseball baseball = result.getBaseball();

        switch (result.getMatchingResult()) {
            case ALL_CORRECT -> OutputView.printCorrect();
            case ONLY_STRIKE -> OutputView.printStrike(baseball.strike());
            case ONLY_BALL -> OutputView.printBall(baseball.ball());
            case NOTHING -> OutputView.printNothing();
            case OTHER -> OutputView.printOther(baseball.ball(), baseball.strike());
        }
    }

    public static boolean printExitOption(String option) {
        OutputView.printExitOption();

        while (true) {
            try {
                int optionNumber = Integer.parseInt(option);
                if (optionNumber == RESTART) return true;
                if (optionNumber == EXIT) return false;
                throw new InvalidInputException(INVALID_RESTART_OPTION_NUMBER);
            } catch (NumberFormatException e) {
                throw new InvalidInputException(INVALID_RESTART_OPTION_NUMBER);
            }
        }
    }
}
