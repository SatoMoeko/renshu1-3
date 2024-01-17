import java.util.ArrayList;
import java.util.Scanner;

public class IrukaApp {

	public static void main(String[] args) {
		System.out.println("***いるかのごはん***");
		ArrayList<Food> foods = new ArrayList<Food>();
		
		System.out.println("1.ごはんをかう 2.あげる 3.運動 4.満腹度 5.終了 >>");
		int select = new Scanner(System.in).nextInt();
		
		switch(select) {
		case 1:
			String[] foodName = { "えび", "わかめ", "こざかな" };
			int[] foodPrice = {50, 100, 200};
			int[] foodHp = {1,2,3};
			System.out.print("どのごはんを買いますか?>>");
			int buyFood = new Scanner(System.in).nextInt();
			String name = foodName[buyFood];
			int price = foodPrice[buyFood]; 
			int hp = foodHp[buyFood];
			System.out.println(name+"を買った");
			Food food = new Food(name,hp, price);
			break;
			
		case 2:
			
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			return;
			
		}

	}

}
