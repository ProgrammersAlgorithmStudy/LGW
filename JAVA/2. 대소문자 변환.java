import java.util.*;
class Main{	
	public String solution(String str){
		String answer = "";
		for (char x : str.toCharArray()) {
			if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x); // x가  소문자냐?
			else answer += Character.toLowerCase(x);
		}
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.print(T.solution(str));
	}
}
