/**
 * The KWC Class, used for making any instance of KWC
 */
public class KWC
{
    private TrickList trickList;
    private int year;
    private static KWC singleInstance; //Singleton

    /**
     * KWC Constructors
     */
    KWC()
    {
        trickList = new TrickList();
        year = -1;

    }

    KWC(int yearParam)
    {
        trickList = new TrickList();
        year = year;
    }

    KWC(int yearParam, TrickList trickListParam)
    {
        year = yearParam;
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
