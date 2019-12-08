package git;

public class Convert {
    public static void main(String[] args) {
        double base = 100.0;
        double mtoCm = 100.0;
        double mToMm = 1_000.0;
        double cmToM = 0.01;
        double mmToM = 0.001;

        ConvertingLength length1 = new ConvertingLength();

        length1.convertingMtoCm(base,mtoCm);
        length1.convertingMtoMm(base,mToMm);
        length1.convertingCmToM(base,cmToM);
        length1.convertingMmtoM(base,mmToM);

        System.out.println(base + " m converted to cm is: " +length1.convertingMtoCm(base,mtoCm) + " cm");
        System.out.println(base + " m converted to mm is " + length1.convertingMtoMm(base,mToMm) + " mm");
        System.out.println(base + " cm converted to m is " + length1.convertingCmToM(base,cmToM) + " m");
        System.out.println(base + " mm converted to m is " + length1.convertingMmtoM(base,mmToM) + " m");

        ConvertingTime time1 = new ConvertingTime();
        int base1 = 1000;
        time1.ConvertingHourToMin(base1);
        time1.ConvertingSecToMillisec(base1);
        time1.ConvertingMinToSec(base1);

        System.out.println("Converting time: ");
        System.out.println(+ base1+ " hour(s) converted to minutes is: " +  time1.ConvertingHourToMin(base1));
        System.out.println(+ base1+ " second(s) converted to milliseconds is: " +  time1.ConvertingSecToMillisec(base1));
        System.out.println(+ base1+ " minutes converted to seconds is: " +  time1.ConvertingMinToSec(base1));



        }


    }



