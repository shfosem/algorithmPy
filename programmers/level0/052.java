//52. 피자 나눠 먹기(2)
class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            if(i*6%n==0){
                answer=i;
                break;
            }
        }
        return answer;
    }
}