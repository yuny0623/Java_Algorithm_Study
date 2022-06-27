package Programmers;


// * https://programmers.co.kr/learn/courses/30/lessons/77884
// *
// * 코멘트: GCD를 구하는 문제가 아니라 그냥 약수의 개수 구하는 문제다. 쉬움.
// *
// * 0200 ~ 0210

public class programmers_1 {

    public int solution(int left, int right) {
        int count = 0;
        for(int i = left; i<=right; i++){
            if(getDivision(i)%2==0){
                count += i;
            }else{
                count -= i;
            }
        }
        return count;
    }
    public int getDivision(int number){
        int count = 0;
        for(int i = 1; i<=number; i++){
            if(number%i == 0){
                count +=1;
            }
        }
        return count;
    }
}
