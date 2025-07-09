package codingTextLevel01;

import java.util.Arrays;

public class Level05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Level05 aa = new Level05();
		
		String a = "onetwothreefourfivesixseveneightnine";
	
		System.out.println((aa.solution(a)));
		//Arrays.toString
	}
	   public long solution(String numbers) {
		   	String strNum = "";
	        String alpa = "";
	        for(int i =0;i<numbers.length(); i++) {
	        	alpa += numbers.charAt(i);
	        	switch(alpa) {
	        	case "zero": strNum += "0"; alpa = "";
	        		break;
	        	case "one": strNum += "1"; alpa = "";
        			break;
	        	case "two": strNum +="2"; alpa = "";
        			break;
	        	case "three": strNum +="3"; alpa = "";
        			break;
	        	case "four": strNum +="4"; alpa = "";
        			break;
	        	case "five": strNum +="5"; alpa = "";
        			break;
	        	case "six": strNum +="6"; alpa = "";
        			break;
	        	case "seven": strNum +="7"; alpa = "";
	        		break;
	        	case "eight": strNum +="8"; alpa = "";
	        		break;
	        	case "nine": strNum +="9"; 	alpa = "";
        			break;
	        	}
	        }
	        long answer = Long.parseLong(strNum);
	        return answer;
	    }
}
