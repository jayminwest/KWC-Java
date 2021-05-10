package Main;

/**
 * Main.KWC Program that uses the Main.KWC tricklist to...
 *
 * @Author Jaymin West
 */
public class Main {
    public static void main(String args[]) {
        KWC kwc2020 = new KWC(2020);
        kwc2020.getTrickList().readInFile();
        System.out.println(kwc2020.getTrickList().getLevels().get(1).toString());
        System.out.println("Finished");
    }
}
