package enum_example;

public class Pet {
	private Animal kind;
	private String name;

	public Pet(Animal animal, String name) {
		this.kind = animal;
		this.name = name;
	}

	@Override
	public String toString() {
		return "あなたのペットの種類は" + this.kind + ", あなたのペットの名前は" + this.name;
	}
}
