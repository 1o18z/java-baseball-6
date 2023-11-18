package baseball;

import baseball.evaluator.Evaluator;
import baseball.baseball.Baseball;
import baseball.baseball.RandomNumber;
import baseball.baseball.UserNumber;
import baseball.result.Result;
import baseball.evaluator.Matcher;
import baseball.view.InputHandler;
import baseball.view.OutputHandler;

public class Controller {

    private final Matcher matcher = new Matcher();
    private final Evaluator evaluator = new Evaluator();

    public boolean play() {
        RandomNumber randomNumber = new RandomNumber();

        while (true) {
            OutputHandler.printInput();

            String inputNumbers = InputHandler.readNumber();
            UserNumber userNumber = new UserNumber(inputNumbers);

            Baseball baseball = matcher.match(randomNumber, userNumber);
            Result result = evaluator.evaluate(baseball);

            OutputHandler.printResult(result);

            String option = InputHandler.readNumber();
            return OutputHandler.printExitOption(option);
        }
    }
}
