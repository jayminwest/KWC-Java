package Main;

import java.io.File;
import java.util.Scanner;

/**
 * The Main.KWC Class, used for making any instance of Main.KWC
 */
public class KWC
{
    private TrickList trickList;
    private int year;
    private static KWC singleInstance; //Singleton
    private File inFile;
    private String fileName;

    /**
     * Main.KWC Constructors
     */
    KWC() {
        System.out.println("New KWC Instance Created");
        inFile = new File(getFileName());
        trickList = new TrickList(inFile);
    }

    public KWC(int yearParam)
    {
        year = yearParam;
        inFile = new File(System.getProperty("user.dir") + "\\src\\TrickListFiles\\" + year + ".txt");
        trickList = new TrickList(inFile);
    }

    public KWC(int yearParam, TrickList trickListParam)
    {
        year = yearParam;
        inFile = new File(getFileName());
        trickList  = trickListParam;
    }

    /**
     * Sinlgeton
     * @return singleInstance
     */
    public KWC getInstance()
    {
        if (singleInstance == null)
        {
            singleInstance = new KWC();
        }
        return singleInstance;
    }

    private String getFileName() {
        String fileName = "";

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter in Desired Year:");
            int year = userInput.nextInt();

        fileName += year + ".txt";

        return fileName;
    }

    private void makeFile(String name)
    {

    }

    /**
     * Getters and Setters:
     */
    public TrickList getTrickList()
    {
        return trickList;
    }

    public void setTrickList(TrickList trickList)
    {
        this.trickList = trickList;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }
}
