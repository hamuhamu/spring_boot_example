package enum_example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PetTest {

	@Test
	public void サンプルテスト() {
		Pet pet = new Pet(Animal.Cat, "ミケ");
		String expected = "あなたのペットの種類はCat, あなたのペットの名前はミケ";

		assertEquals(expected, pet.toString());
	}
}
