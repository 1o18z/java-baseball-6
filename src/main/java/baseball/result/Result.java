package baseball.result;

import baseball.baseball.Baseball;

public class Result {

    private final MatchingResult matchingResult;
    private final Baseball baseball;

    public Result(MatchingResult matchingResult, Baseball baseball) {
        this.matchingResult = matchingResult;
        this.baseball = baseball;
    }

    public MatchingResult getMatchingResult() {
        return matchingResult;
    }

    public Baseball getBaseball() {
        return baseball;
    }
}
