import java.util.*;

public class ArrayListScore {
	public static void main(String[] args) {
		
		ArrayList<Character> a = new ArrayList<Character> ();
		Scanner scanner = new Scanner(System.in);
		System.out.println("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
		
		double sum = 0;
		
		for(int i=0; i<6; i++) {	//for문과 scanner로 입력받기
			String score = scanner.next();
			a.add(score.charAt(0));
		}
		for(int j=0; j<a.size(); j++) {
			char ch = a.get(j);
			switch(ch)	{	//case로 학점과 점수 넣기
			case 'A' : sum += 4.0; break;
			case 'B' : sum += 3.0; break;
			case 'C' : sum += 2.0; break;
			case 'D' : sum += 1.0; break;
			case 'F' : sum += 0.0; break;	
		}
	}
	System.out.println((double)sum/6);	//평균내기
	scanner.close();
	}
}