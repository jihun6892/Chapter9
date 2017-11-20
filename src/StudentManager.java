import java.util.*;

public class StudentManager {
	private Scanner scanner = new Scanner(System.in);
	private HashMap<String, Student> b = new HashMap<String, Student>();
	
	private void read() {
		System.out.println("학생 이름,학과,학번,학점평균 입력하세요.");
		for (int i=0; i<4; i++) {
			System.out.print(">> ");
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			String name = st.nextToken().trim();
			String department = st.nextToken().trim();
			String id = st.nextToken().trim();
			double grade = Double.parseDouble(st.nextToken().trim());
			
			Student student = new Student(name, department, id, grade);
			b.put(name, student); //해시맵에 저장
		}			
	}
	
	private void printAll() {
		Set<String> key = b.keySet();
		Iterator<String> it = key.iterator();
		while (it.hasNext()) {
			String name = it.next(); // 이름 알아냄
			Student student = b.get(name); // 이름으로 해시맵으로 Student 객체얻어내기
			System.out.println("---------------------------");
			System.out.println("이름:" + student.getName());
			System.out.println("학과:" + student.getDepartment());
			System.out.println("학번:" + student.getId());
			System.out.println("학점평균:" + student.getGrade());
			System.out.println("---------------------------");
		}		
	}

	private void processQuery() {
		while(true) {
			System.out.print("학생 이름 >> ");
			String name = scanner.nextLine(); // 학생 이름 입력
			if(name.equals("그만"))
				return;
			
			Student student = b.get(name); // 해시맵에서 이름으로 검색
			if(student == null) {
				System.out.println(name + " 학생 없습니다.");
			}
			else {
				System.out.print(student.getName() + ", ");
				System.out.print(student.getDepartment() + ", ");
				System.out.print(student.getId() + ", ");
				System.out.println(student.getGrade());
			}
		}
	}
	
	public void run() {
		read();
		printAll();
		processQuery();
	}
	
	public static void main (String[] args) {
		StudentManager man = new StudentManager();
		man.run();
	}
}