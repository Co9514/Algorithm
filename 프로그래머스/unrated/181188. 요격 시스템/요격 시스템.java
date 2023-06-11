import java.util.Arrays;

class Solution {
    public int solution(int[][] targets) {
        int answer = 1;
        Arrays.sort(targets, (i,j) -> j[0] - i[0]);
        int T = targets[0][0];
        for (int[]target : targets) {
            if(target[1] <= T){
                answer ++;
                T = target[0];
            }
        }
        return answer;
    }
}