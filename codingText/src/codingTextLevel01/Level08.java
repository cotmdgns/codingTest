package codingTextLevel01;

import java.util.Arrays;

public class Level08 {

	public static void main(String[] args) {
		Level08 aa = new Level08();
		
		int[] a = {1, 2, 3, 4, 5, 6};
		int b = 4;
		
		System.out.println(Arrays.toString(aa.solution(a,b)));
		

	}
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        
        // 진짜 특이한 정렬이네
        // 처음엔 4
        // 다음은 4와 제일 가까운 숫자
        // 대신 둘다 거리가 비슷하면 높은 숫자로
        // 해답은 빼기에 있을거 같다 = 서로 뺀다음 큰 수는 -로 나올꺼고 낮은 수는 +로
        
        for(int i =0;i<numlist.length;i++) {
        	answer[i] += numlist[i] - (n); // [-3, -2, -1, 0, 1, 2]
        	// 이걸 저장하고 낮은 수의 인덱스부터 천천히 넣기
        	// 대신 같은 수일 경우엔 +부터 넣고 다음은 마이너스부터
        	
        }
        
        // 존나 어렵다 정렬
        return answer;
    }

}
