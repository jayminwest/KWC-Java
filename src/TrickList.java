import java.util.ArrayList;

/**
 * Class that has an arrayList of tricks
 */
public class TrickList {
    private ArrayList<Level> levels;

    /**
     * Trick List Constructors
     */
    TrickList()
    {
        levels = new ArrayList<Level>();
    }

    TrickList(ArrayList<Level> levelsParam)
    {
        levels = levelsParam;
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
