package baseball.evaluator;

import baseball.baseball.Baseball;
import baseball.result.MatchingResult;
import baseball.result.Result;

import static baseball.utils.Constant.FULL_CORRECT_COUNT;

public class Evaluator {

    public Result evaluate(Baseball baseball) {
        int strike = baseball.strike();
        int ball = baseball.ball();

        if (strike == FULL_CORRECT_COUNT) {
            return new Result(MatchingResult.ALL_CORRECT, baseball);
        } else if (strike == 0 && ball == 0) {
            return new Result(MatchingResult.NOTHING, baseball);
        } else if (strike != 0 && ball == 0) {
            return new Result(MatchingResult.ONLY_STRIKE, baseball);
        } else if (strike == 0 && ball != 0) {
            return new Result(MatchingResult.ONLY_BALL, baseball);
        } else {
            return new Result(MatchingResult.OTHER, baseball);
        }
    }
}
