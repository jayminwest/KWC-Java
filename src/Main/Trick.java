package Main;

public class Trick {
    private String trickName;
    private int trickSubLevel;

    /**
     * Constructors:
     */
    Trick() {
        trickName = "NULL";
        trickSubLevel = -1;
    }

    public Trick(String trickName, int trickSubLevel)
    {
        this.trickName = trickName;
        this.trickSubLevel = trickSubLevel;
    }

    /**
     * To String of the trick
     *
     * @return String of trick name
     */
    @Override
    public String toString() {
        return "Trick Name: " + trickName + ", Sublevel:  " + trickSubLevel + '\n';
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
}
