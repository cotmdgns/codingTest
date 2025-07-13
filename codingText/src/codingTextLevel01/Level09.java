package codingTextLevel01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class Level09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Level09 aa = new Level09();
		
		int[] a = {1, 2, 3, 4, 5, 6};
		int b = 42;
		
		System.out.println((aa.solution(b)));
		

	}
	

    public Set<Integer> solution(int n) {
    	Set<Integer> answer = new LinkedHashSet<>();
        while(n > 1) {
            for(int i=2;i<=n;i++) {
            	if(n % i == 0 ) {
            		n = n / i;
            		answer.add(i);
            		break;
            	}
            }
        }
        
        return answer;
    }

}
