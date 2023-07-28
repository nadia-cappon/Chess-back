
public class GamePlayer {

	String name;
	String nationality;
	int eloRating;
	Color myColor;

	/**
	 * @param myColor
	 */
	public GamePlayer(Color myColor) {
		super();
		this.myColor = myColor;
	}

	Color getColor() {
		return myColor;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the nationality
	 */
	public String getNationality() {
		return nationality;
	}

	/**
	 * @param nationality the nationality to set
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	/**
	 * @return the eloRating
	 */
	public int getEloRating() {
		return eloRating;
	}

	/**
	 * @param eloRating the eloRating to set
	 */
	public void setEloRating(int eloRating) {
		this.eloRating = eloRating;
	}

	/**
	 * @return the myColor
	 */
	public Color getMyColor() {
		return myColor;
	}

	/**
	 * @param myColor the myColor to set
	 */
	public void setMyColor(Color myColor) {
		this.myColor = myColor;
	}

}
