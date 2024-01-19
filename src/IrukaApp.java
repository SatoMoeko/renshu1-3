import java.util.ArrayList;
import java.util.Scanner;

public class IrukaApp {

	public static void main(String[] args) {
		System.out.println("***いるかのごはん***");
		ArrayList<Food> foods = new ArrayList<Food>();
		Iruka iruka = new Iruka();
		int total = 0;

		while (true) {

			System.out.print("\n1.ごはんをかう 2.あげる 3.運動 4.満腹度 5.終了 >>");
			int select = new Scanner(System.in).nextInt();

			switch (select) {
			case 1:
				display();
				String[] foodName = { "えび", "わかめ", "こざかな" };
				int[][] foodScores = { { 50, 100, 200 }, { 1, 2, 3 } };
				System.out.print("どのごはんを買いますか?>>");
				int buyFood = new Scanner(System.in).nextInt();
				String name = foodName[buyFood];
				int price = foodScores[0][buyFood];
				total += price;//合計金額
				int hp = foodScores[1][buyFood];
				System.out.println(name + "を買った");
				Food food = new Food(name, price, hp);
				foods.add(food);
				break;

			case 2:
				eat(foods, iruka);
				break;

			case 3:
				iruka.run();
				break;

			case 4:
				System.out.println("現在の満腹度は[" + iruka.stomach + "]です");
				break;
			case 5:
				System.out.println("お支払金額：" + total + "円");
				return;
			default:
				System.out.println("1～5の番号から選んでください");

			}
		}
	}

	//ごはん一覧表示
	public static void display() {
		String[] foodName = { "えび", "わかめ", "こざかな" };
		int[][] foodScores = { { 50, 100, 200 }, { 1, 2, 3 } };

		for (int i = 0; i < foodName.length; i++) {
			System.out.println(i + ":" + foodName[i] + " " + foodScores[0][i] + "円[満腹度:" + foodScores[1][i] + "]");
		}

	}

	//ごはんあげる
	public static void eat(ArrayList<Food> foods, Iruka iruka) {
		if (foods.size() == 0) {
			System.out.println("ごはんがありません…");
		} else {
			for (int i = 0; i < foods.size(); i++) {
				System.out.printf("%d:%s\n", i, foods.get(i).name);
			}
			System.out.print("どのごはんをあげますか?>>");
			int select = new Scanner(System.in).nextInt();

			if (iruka.stomach < 7) {
				foods.get(select).hunger();
				iruka.stomach += foods.get(select).hp;
				foods.remove(select);
			} else if (iruka.stomach == 7) {
				if (foods.get(select).hp == 3) {
					System.out.println("いるかはもう満腹だ");
				} else {
					foods.get(select).hunger();
					iruka.stomach += foods.get(select).hp;
					foods.remove(select);
				}
			} else if (iruka.stomach == 8) {
				if (foods.get(select).hp == 3) {
					System.out.println("いるかはもう満腹だ");
				} else {
					foods.get(select).hunger();
					iruka.stomach += foods.get(select).hp;
					foods.remove(select);
				}
			} else if (iruka.stomach == 9) {
				if (foods.get(select).hp == 1) {
					foods.get(select).hunger();
					iruka.stomach += foods.get(select).hp;
					foods.remove(select);
				} else {
					System.out.println("いるかはもう満腹だ");
				}
			} else if (iruka.stomach >= 10) {
				System.out.println("いるかはもう満腹だ");
			}

		}
	}

}
