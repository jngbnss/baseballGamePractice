package Downloads.baseballGamePractice.src.main.java.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class numberCheck {
    private List<Integer> inputnumber=  new ArrayList<>();

    public numberCheck(int inputnumber) {
        while(inputnumber>0){
            this.inputnumber.add(0,inputnumber%10);
            // 왜 0을 넣어야 잘들어가지?
            inputnumber/= 10;
        }
    }

    public List<Integer> getInputnumber() {
        return inputnumber;
    }


}
