package Downloads.baseballGamePractice.src.main.java.model;

import java.util.ArrayList;
import java.util.List;

public class calculate {
    private List<Integer> correct = new ArrayList<Integer>();
    private List<Integer> input = new ArrayList<Integer>();

    private int strike;
    private int ball;
    private boolean nothing = true;

    public calculate(List<Integer> correct, List<Integer> input) {
        this.correct = correct;
        this.input = input;
    }

    public List<Integer> getCorrect() {
        return correct;
    }

    public List<Integer> getInput() {
        return input;
    }
    public void check(){
        strike = 0;
        ball = 0;
        nothing = false;
        for (int i = 0; i < correct.size(); i++) {
            int c = correct.get(i);
            if(c==input.get(i)){
                strike++;
            }else if(input.contains(c)){
                ball++;
            }
        }
        if(strike==0&&ball==0){
            nothing = true;
        }
        this.strike = strike;
        this.ball = ball;
        this.nothing = nothing;
    }

    @Override
    public String toString() {
        return "calculate{" +
                "strike=" + strike +
                ", ball=" + ball +
                ", nothing=" + nothing +
                '}';
    }

    //    public void check(){
//        for(int i=0;i<correct.size();i++){
//            if(correct.indexOf(i)== input.indexOf(i))strike++;
//            else(input.contains(correct.indexOf(i))) ball++;
//        }
//        if(strike==0&&ball==0) nothing=true;
//
//    }
}
