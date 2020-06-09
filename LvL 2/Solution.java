import java.util.Arrays;

public class Solution {
    public static int solution(int[] l) {
        // Your code here
        int sz = l.length;
        Arrays.sort(l);
        int ans = 0;
        for(int mask = 0; mask < (1<<sz); mask++){
            int cur = 0;
            for(int bit = sz-1; bit >= 0; bit--){
                int res = mask & (1<<bit);
                if( res > 0){
                    cur*=10;
                    cur+=l[bit];
                }
            }
            if(cur % 3 == 0){ ans = Math.max(ans,cur); }
        }
        return  ans;
    }
}
