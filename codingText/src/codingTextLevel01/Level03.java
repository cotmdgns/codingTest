package codingTextLevel01;

public class Level03 {

	//치킨 쿠폰
	public static void main(String[] args) {
		
		Level03 aa = new Level03();
		
		System.out.println(aa.solution(1081));

	}

	
    public int solution(int chicken) {
        int answer = 0;
        int coupone = 0;
        
        while(chicken > 0) {
    		coupone += chicken % 10;
    		chicken = chicken / 10;
    		answer += chicken;
    		if(coupone >= 10) {
    			answer++;
    		}
    	}
        return answer;
    }
}
