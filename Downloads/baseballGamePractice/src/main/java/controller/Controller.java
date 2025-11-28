package Downloads.baseballGamePractice.src.main.java.controller;

import Downloads.baseballGamePractice.src.main.java.model.Baseball;
import Downloads.baseballGamePractice.src.main.java.model.calculate;
import Downloads.baseballGamePractice.src.main.java.model.numberCheck;
import Downloads.baseballGamePractice.src.main.java.view.InputView;
import Downloads.baseballGamePractice.src.main.java.view.OutputView;
import java.util.List;
import java.util.Scanner;

public class Controller {
    OutputView outputView = new OutputView();
    Baseball baseball = new Baseball();
    InputView inputView = new InputView();
    public void run(){
        Scanner scanner = new Scanner(System.in);

        // 게임 시작 알림
        outputView.start();

        // 숫자 생성
        List<Integer> numbers = baseball.getNumbers();
        System.out.println("numbers = " + numbers);

        // 숫자 입력
        inputView.inputNumbers();
        int input = scanner.nextInt();

        System.out.println("input = " + input);

        numberCheck numberCheck = new numberCheck(input);
        List<Integer> checknumber = numberCheck.getInputnumber();
        System.out.println("checknumber = " + checknumber);
        
        calculate calculate = new calculate(numbers,checknumber);
        System.out.println("calculate.getCorrect() = " + calculate.getCorrect());
        System.out.println("calculate.getInput() = " + calculate.getInput());
        calculate.check();
        System.out.println("calculate = " + calculate);

    }
}
