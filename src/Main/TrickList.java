package Main;

import java.util.ArrayList;

/**
 * Class that has an arrayList of tricks
 */
public class TrickList {
    private ArrayList<Level> levels;

    /**
     * Main.Trick List Constructors
     */
    TrickList()
    {
        levels = new ArrayList<Level>();
    }

    TrickList(ArrayList<Level> levelsParam)
    {
        levels = levelsParam;
    }


    @Override
    public String toString() {
        return "TrickList{" +
                "levels=" + levels +
                '}';
    }

    /**
     * Getters and Setters:
     */
    public ArrayList<Level> getLevels()
    {
        return levels;
    }

    public void setLevels(ArrayList<Level> levels)
    {
        this.levels = levels;
    }
}
