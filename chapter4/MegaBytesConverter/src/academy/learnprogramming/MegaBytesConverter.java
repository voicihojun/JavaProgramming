package academy.learnprogramming;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megabytes = kiloBytes / 1024;
        int remainingKilobytes = kiloBytes % 1024;

        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = "
                    + megabytes + " MB and "
                    + remainingKilobytes + " KB");
        }
    }
}
