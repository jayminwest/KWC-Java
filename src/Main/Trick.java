package Main;

public class Trick {
    private String trickName;
    private int trickSubLevel;
    private String playerName;

    /**
     * Constructors:
     */
    public Trick(String trickName, int trickSubLevel, String playerName)
    {
        this.trickName = trickName;
        this.trickSubLevel = trickSubLevel;
        this.playerName = playerName;
    }

    /**
     * To String of the trick
     *
     * @return String of trick name
     */
    @Override
    public String toString() {
        return "Trick{" +
                "trickName='" + trickName + '\'' +
                ", trickSubLevel=" + trickSubLevel +
                ", playerName='" + playerName + '\'' +
                '}';
    }

    /**
     * Getters and Setters:
     */
    public String getTrickName()
    {
        return trickName;
    }

    public void setTrickName(String trickName)
    {
        this.trickName = trickName;
    }

    public int getTrickSubLevel() {
        return trickSubLevel;
    }

    public void setTrickSubLevel(int trickSubLevel)
    {
        this.trickSubLevel = trickSubLevel;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName)
    {
        this.playerName = playerName;
    }
}
