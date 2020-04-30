package patronesCreacionales.prototype;

public class ItemB extends PrototypeItem {

	public ItemB(String x, String y, String z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	public PrototypeItem clone() {
		return new ItemB(this.x, this.y, this.z);
	}
}
