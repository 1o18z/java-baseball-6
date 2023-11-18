package baseball.evaluator;

import java.util.List;
import java.util.Objects;
import baseball.baseball.Baseball;
import baseball.baseball.RandomNumber;
import baseball.baseball.UserNumber;

import static baseball.utils.Constant.DEFAULT_VALUE;

public class Matcher {

    public Baseball match(RandomNumber randomNumber, UserNumber userNumber) {
        List<Integer> randomNumbers = randomNumber.getRandomNumbers();
        List<Integer> userNumbers = userNumber.getUserNumbers();

        int ballCount = DEFAULT_VALUE;
        int strikeCount = DEFAULT_VALUE;

        for (int i = 0; i < userNumbers.size(); i++) {
            if (randomNumbers.contains(userNumbers.get(i))) {
                if (Objects.equals(randomNumbers.get(i), userNumbers.get(i))) {
                    strikeCount++;
                } else {
                    ballCount++;
                }
            }
        }
        return new Baseball(ballCount, strikeCount);
    }
}
