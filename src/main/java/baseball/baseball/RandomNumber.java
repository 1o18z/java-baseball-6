package baseball.baseball;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import camp.nextstep.edu.missionutils.Randoms;

import static baseball.utils.Constant.MAX_NUMBER;
import static baseball.utils.Constant.MIN_NUMBER;
import static baseball.utils.Constant.NUMBER_LENGTH;

public class RandomNumber {

    private List<Integer> randomNumbers;

    public RandomNumber() {
        this.randomNumbers = new ArrayList<>(generateRandomNumber());
    }

    private List<Integer> generateRandomNumber() {
        while (randomNumbers.size() < NUMBER_LENGTH) {
            int randomNumber = Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER);

            if (!randomNumbers.contains(randomNumber)) {
                randomNumbers.add(randomNumber);
            }
        }
        return randomNumbers;
    }

    public List<Integer> getRandomNumbers() {
        return Collections.unmodifiableList(randomNumbers);
    }
}
