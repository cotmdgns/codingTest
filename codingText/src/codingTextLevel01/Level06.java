package codingTextLevel01;

public class Level06 {

	public static void main(String[] args) {

		Level06 aa = new Level06();
		
		int a = 29183,b=1;
	
		System.out.println((aa.solution(a,b)));

	}
	
    public int solution(int num, int k) {
        int answer = 0;
        for(int i =0;i<String.valueOf(num).length();i++	) {
        	if(String.valueOf(num).charAt(i) == '0'+k) {
        		return answer = i+1;
        	}
        }
        return -1;
    }
}
