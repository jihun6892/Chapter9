import java.util.HashMap;
import java.util.Scanner;
class Location {
	String country;
	int lat, lon;

	public Location(String country, int lat, int lon) { //�����ڸ����
		this.country = country;
		this.lat = lat;
		this.lon = lon;
	}
}

public class LocationA {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Location> map = new HashMap<String, Location>(); //HasgMap�̿�
		System.out.println("����,�浵,������ �Է��ϼ���.");
		for (int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String[] str = scanner.nextLine().split(", ");
			int d1 = Integer.parseInt(str[1]);
			int d2 = Integer.parseInt(str[2]);
			map.put(str[0], new Location(str[0], d1, d2));
		}
		System.out.println("----------------");
		for (String key : map.keySet()) {
			Location loc = map.get(key); //���÷� ã��
			System.out.println(loc.country + "\t" + loc.lat + "\t" + loc.lon);
		}
		System.out.println("----------------");
		while (true) {
			System.out.print("�����̸� >> ");
			String str = scanner.nextLine();
			if (str.equals("�׸�")) {
				break;	//�׸� �Է��ϸ� ������
			}
			if (map.containsKey(str)) {
				Location loc = map.get(str);
				System.out.println(loc.country + "\t" + loc.lat + "\t" + loc.lon);
			} else {
				System.out.println(str + "��(��) �����ϴ�.");
			}
		}
	}
}