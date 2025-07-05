package codingTextLevel01;

import java.util.Arrays;

public class Level02 {

	public static void main(String[] args) {
		
		Level02 aa = new Level02();
		
		String[] keyinput = {"down", "down", "down", "down", "down"};
		int[] board = {7,9};
		
		System.out.println(Arrays.toString(aa.solution(keyinput, board)));
	}
	
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        for(int i=0;i<keyinput.length; i++) {
        	switch(keyinput[i]) {
        		case "up": ++answer[1];
        			break;
        		case "down": --answer[1];
        			break;
        		case "left": --answer[0];
        			break;
        		case "right": ++answer[0];
        			break;
        	}
        	if(answer[0] > board[0] / 2) {
        		answer[0] = board[0] / 2;
        	}else if(answer[1] > board[1] / 2) {
        		answer[1] = board[1] / 2;
        	}else if(answer[0] < -board[0] /2 ) {
        		answer[0] = -board[0] / 2;
        	}else if(answer[1] < -board[1] /2 ) {
        		answer[1] = -board[1] / 2;
        	}
        }
        return answer;
    }

}
