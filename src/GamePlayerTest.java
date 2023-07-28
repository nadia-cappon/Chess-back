import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GamePlayerTest {

	@Test
	void testColor() {

		Color color = new WhiteColor();

		GamePlayer player = new GamePlayer(color);

		Color playerColor = player.getColor();

		assertEquals(color, playerColor, "la couleur du joueur n est pas celle attendue: blanc");

	}

	@Test
	void testRating() {

		GamePlayer player = new GamePlayer(new BlackColor());

		player.setEloRating(1200);

		int eloRating = player.getEloRating();

		assertEquals(eloRating, 1200, "le niveau de joueur n'est pas celui qui est attendu: 1200");
	}

	@Test
	void testName() {

		GamePlayer player = new GamePlayer(new BlackColor());

		player.setName("Sébastien");
		String playerName = player.getName();

		assertEquals(playerName, "Sébastien", "le nom de joueur n'est pas celui qui est attendu: Sébastien");

		assertNotEquals(playerName, "Nadia", "le nom de joueur n'est pas celui qui est attendu: Sébastien");
	}

}
