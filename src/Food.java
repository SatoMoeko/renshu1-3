
public class Food {
	String name;
	int price;
	int hp;

	public Food(String name, int price, int hp) {
		this.name = name;
		this.price = price;
		this.hp = hp;
	}

	public void hunger() {
		System.out.println(this.name + "をあげた");
		System.out.println("いるかの満腹度が" + this.hp + "あがった");
	}

}
