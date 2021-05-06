import java.util.ArrayList;

public class Level {
    private ArrayList<Trick> tricks;

    /**
     * Level Constructors
     */
    Level()
    {
        tricks = new ArrayList<Trick>();
    }

    Level(ArrayList<Trick> tricksParam)
    {
        tricks = tricksParam;
    }



    public ArrayList<Trick> getTricks() {
        return tricks;
    }

    public void setTricks(ArrayList<Trick> tricks) {
        this.tricks = tricks;
    }
}
