import java.util.*;
public class RainfallStatistics {
    public static void print(Vector<Integer> v) { 

       Iterator<Integer> it = v.iterator(); //Integer ����ϱ�
       int sum = 0;

        it = v.iterator();

        while (it.hasNext()) {	//while������ sum����
            int n = it.next();
            sum += n;
        }
        System.out.print("���� ��� " + sum / v.size());
    }	//��ձ��ϱ�
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Integer> v = new Vector<Integer>();
        while (true) {	//while���� ��ĳ�ʷ� �Է¹ޱ�
            System.out.print("������ �Է� (0 �Է½� ����)>> ");
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