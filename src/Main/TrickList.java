package Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class that has an arrayList of tricks
 */
public class TrickList {
    private ArrayList<Level> levels;
    private File inFile;

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

    TrickList(File inFileParam, ArrayList<Level> levelsParam) {
        levels = levelsParam;
        inFile = inFileParam;
    }

    TrickList (File inFileParam) {
        levels = new ArrayList<Level>();
        inFile = inFileParam;
    }

    void readInFile() {
        String tempLine;
        int levelsIndex = 0;

        for (int i = 0; i < 10; ++i) {
            levels.add(new Level());
        }

        try {
            Scanner reader = new Scanner(inFile);

            while (reader.hasNextLine()) {
                tempLine = reader.nextLine();

                if (tempLine.contains("Level")) {
                    levels.set(levelsIndex, new Level(levelsIndex + 1)); //+1 to change level number away from index number

                    for (int trickSubLevel = 0; trickSubLevel <= 9; ++trickSubLevel) {
                        levels.get(levelsIndex).getTricks().add(trickSubLevel, new Trick(reader.nextLine(), trickSubLevel + 1));
                    }

                    levelsIndex++;
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: Couldn't open inFile in TrickList.java");
            e.printStackTrace();
        }
    }

    /**
     * To string function for outputting the class
     * @return
     */
    @Override
    public String toString() {
        return "TrickList: \n" + levels;
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
