package codingTextLevel01;

import java.util.Arrays;

public class Level07 {

	public static void main(String[] args) {
		

		Level07 aa = new Level07();
		
		int[] a = {3, 76, 24};
		
		System.out.println(Arrays.toString(aa.solution(a)));
		

	}

    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        for(int i =0; i<emergency.length;i++) {
        	for(int j=0;j<emergency.length;j++) {
        		if(emergency[i] < emergency[j]) {
        			answer[i]++;
        		}
        	}
        	answer[i]++;
        }
        return answer;
    }
}
