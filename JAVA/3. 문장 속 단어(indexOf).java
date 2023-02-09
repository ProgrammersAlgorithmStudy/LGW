import java.util.*;
class Main{	
	public String solution(String str){
		String answer = "";
		int m = Integer.MIN_VALUE, pos; 
		while((pos=str.indexOf(" "))!=-1) { // 띄어쓰기 차음 발견 
			String tmp = str.substring(0, pos); 
			int len = tmp.length();
			if(len>m) { // 같다고 하면 안됨 앞쪽에 위치한 단어를 뽑아내야하니깐
				m = len;
				answer = tmp;
			}
			str = str.substring(pos+1); // 뜯어내고 그 다음 띄어쓰기 
		}
		if(str.length() > m) answer=str; // 마지막 단어 처리 study
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.print(T.solution(str));
	}
}
