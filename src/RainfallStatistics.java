import java.util.*;
public class RainfallStatistics {
    public static void print(Vector<Integer> v) { 

       Iterator<Integer> it = v.iterator(); //Integer 사용하기
       int sum = 0;

        it = v.iterator();

        while (it.hasNext()) {	//while문으로 sum지정
            int n = it.next();
            sum += n;
        }
        System.out.print("현재 평균 " + sum / v.size());
    }	//평균구하기
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Integer> v = new Vector<Integer>();
        while (true) {	//while문과 스캐너로 입력받기
            System.out.print("강수량 입력 (0 입력시 종료)>> ");
            int n = scanner.nextInt();
            if (0 == n)
                break;
            else
                v.add(n);
            for (int i = 0; i < v.size(); i++) {
                System.out.print(v.get(i) + " ");
            }
            System.out.println(" ");

            print(v);

            System.out.println(" ");

        }
        scanner.close();
    }
}