package Main;

import java.util.ArrayList;

public class Level {
    private ArrayList<Trick> tricks;
    private int levelNumber;

    /**
     * Level Constructors
     */
    public Level()
    {
        tricks = new ArrayList<Trick>();
    }

    public Level(int levelNumberParam)
    {
        levelNumber = levelNumberParam;
    }

    public Level(ArrayList<Trick> tricksParam)
    {
        tricks = tricksParam;
    }

    @Override
    public String toString() {
        return "Level{" +
                "tricks=" + tricks +
                ", levelNumber=" + levelNumber +
                '}';
    }

    /**
     * Getters and setters:
     */
    public ArrayList<Trick> getTricks() {
        return tricks;
    }

    public void setTricks(ArrayList<Trick> tricks) {
        this.tricks = tricks;
    }
}
