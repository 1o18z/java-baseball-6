package baseball;

import baseball.view.OutputView;

public class Application {

    private static final Controller controller = new Controller();

    public static void main(String[] args) {
        while (true) {
            OutputView.printStart();

            if (!controller.play()) {
                break;
            }
        }
    }
}
