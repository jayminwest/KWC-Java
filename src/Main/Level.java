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
        levelNumber = -1;
        tricks = new ArrayList<Trick>();
    }

    public Level(int levelNumberParam)
    {
        levelNumber = levelNumberParam;
        tricks = new ArrayList<Trick>();
    }

    public Level(ArrayList<Trick> tricksParam)
    {
        levelNumber = -1;
        tricks = tricksParam;
    }

    @Override
    public String toString() {
        return "Level " + levelNumber + ": \n" + "Tricks: \n" + tricks;
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
