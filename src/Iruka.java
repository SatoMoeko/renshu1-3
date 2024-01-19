
public class Iruka {
	int stomach;

	public Iruka() {
		this.stomach = 0;
	}

	public void run() {
		if (this.stomach > 1) {
			System.out.println("いるかは運動した");
			this.stomach -= 2;
			System.out.println("満腹度は[2]さがった");
		} else {
			System.out.println("いるかは空腹でうごけない");
		}
	}
}
