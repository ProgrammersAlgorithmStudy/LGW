import java.util.*;

class Main{

	public ArrayList<String> solution(int n, String[] str){
		ArrayList<String> answer = new ArrayList<>();
		for(String x : str) {
			String tmp = new StringBuilder(x).reverse().toString();
			/* StringBuilder는 변경 가능한 문자열을 만들어 주기 때문에
			String을 합치는 작업 시 하나의 대안이 될 수 있다.
			toString 넣는 거 */
			answer.add(tmp); // arrayList answer arraylist 에 추가 add
			
		}
		return answer;
	}
	
public static void main(String args[]) {
	Main T = new Main();
	Scanner kb = new Scanner(System.in);
	int n = kb.nextInt();
	String[] str = new String[n];
	for(int i = 0; i < n; i++) {
		str[i] = kb.next();
	}
	for(String x : T.solution(n, str)) {
		System.out.println(x);
	}
}
}
