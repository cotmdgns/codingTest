package codingTextLevel01;

public class Level04 {

	public static void main(String[] args) {
		
		Level04 aa = new Level04();
		
		int[][]	a = {{20,40},{20,60},{70,50},{80,80},{70,10},{80,70}};
		System.out.println(aa.solution(a));
	}

    public int[] solution(int[][] score) {
    	// 반복문을 돌려서 i번째로 들어갈꺼임
    	// 근데 조건문을 걸어서 i번째랑 그 뒤에오는 i번째의 숫자가 같으면 i-1해서 이걸 집어 넣으면 됨
    	// 어쩌피 첫번째랑 마지막번째는 안걸림 왜? 조건문이 false이기때문에 그냥 넘어가게 될 로직임
    	// 문제는 이제 평균을 구하고 나온 배열 위치에 i를 넣어야 하는데[
    	// 정렬안 안한 상태에서 비교를 해야함
    	// 아니면 정렬 후, 정렬 한 배열들을 score 평균이랑 비교 해서 넣기?
    
        int[] answer = {};
        for(int i=0;i<score.length;i++	) {
        	
        }
        return answer;
    }
}
