package codingTextLevel01;

public class Level01 {

	public static void main(String[] args) {
			
		Level01 aa = new Level01();
		
		
		System.out.println(aa.solution(36));
	}
	// 369게임
    public int solution(int order) {
        int answer = 0;
        String[] num = {"3","6","9"};
        String[] ary = String.valueOf(order).split("");
        for(int i=0;i < ary.length;i++) {
        	for(int j=0; j<num.length; j++) {
        		if(ary[i].equals(num[j])) {
        			answer++;
        		}
        	}
        }    
        return answer;
    }

}
