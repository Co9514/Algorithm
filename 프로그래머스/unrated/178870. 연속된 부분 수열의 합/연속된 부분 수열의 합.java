class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = {};
        int minCount = 1000001;
        int sum = 0;
        int lastIndex=-1;
        int firstIndex=0;
        int count = 0;
        while (lastIndex < sequence.length) {
            if(firstIndex == sequence.length) break;
            if(sum >= k) {
                if(sum > k){
                    sum -= sequence[firstIndex];
                    firstIndex ++;
                    count--;
                }
                if(sum == k) {
                    if (count < minCount) {
                        answer = new int[]{firstIndex, lastIndex};
                        minCount = count;
                    }
                    count ++;
                    lastIndex ++;
                    if(lastIndex > sequence.length - 1) lastIndex --;
                    sum += sequence[lastIndex];
                }
            }
            if(sum < k){
                count ++;
                lastIndex ++;
                if(lastIndex > sequence.length - 1) break;
                sum += sequence[lastIndex];
            }
        }
        return answer;
    }
}