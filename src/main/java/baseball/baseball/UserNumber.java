package baseball.baseball;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import baseball.exception.InvalidInputException;

import static baseball.utils.Constant.INVALID_INPUT_LENGTH;
import static baseball.utils.Constant.NUMBER_LENGTH;

public class UserNumber {

    private List<Integer> userNumbers;

    public UserNumber(String inputNumbers) {
        List<Integer> numbers = validateInputNumbers(inputNumbers);
        this.userNumbers = new ArrayList<>(numbers);
    }

    private List<Integer> validateInputNumbers(String inputNumbers) {
        Set<String> numberSet = Arrays.stream(inputNumbers.split(""))
                .collect(Collectors.toSet());
        checkNumbers(numberSet);
        return convertToNumber(numberSet);
    }

    private List<Integer> convertToNumber(Set<String> numberSet) {
        return numberSet.stream()
                .map(Integer::parseInt)
                .toList();
    }

    private void checkNumbers(Set<String> numberSet) {
        if (numberSet.size() != NUMBER_LENGTH) {
            throw new InvalidInputException(INVALID_INPUT_LENGTH);
        }
    }

    public List<Integer> getUserNumbers() {
        return Collections.unmodifiableList(userNumbers);
    }
}
