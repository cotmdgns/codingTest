package codingTextLevel01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Level04 {

	public static void main(String[] args) {
		
		Level04 aa = new Level04();
		
		int[][]	a = {{1, 3},{3, 1},{2, 3},{3, 2},{1, 2},{1, 1}};
		System.out.println(Arrays.toString(aa.solution(a)));
	}

    public int[] solution(int[][] score) {
        Double[] avg = new Double[score.length];
        for(int i=0;i<score.length;i++	) {
        	avg[i] = ((double) ( score[i][0] + score[i][1] ) / 2);
        }
        int [] sum = new int[score.length];
        for(int i=0;i<avg.length;i++) {
        	for(int j=0;j<avg.length;j++) {
        		if(avg[i] < avg[j]) {
        			sum[i]++ ;
        		}
        	}
        	sum[i]++;
        }
        return sum;
    }
}
;