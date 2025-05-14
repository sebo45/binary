import java.io.*;
public class Binary {
    public static int binaryToDec(int bin) {
        String binst = String.valueOf(bin);
        char [] einzel = binst.toCharArray();
        int eins;
        int gesamt = 0;
        for(int i =0; i< einzel.length;i++)
        {
            eins = Integer.parseInt(String.valueOf(einzel[einzel.length-1-i]));
            eins = eins * (int)Math.pow(2,i);
            gesamt += eins;
        }
        if(gesamt!=0) {
            System.out.println(gesamt);
            return gesamt;
        }
        return -1;
    }
    public static int decToBin(int dec)
    {
        StringBuilder dc = new StringBuilder();

        while (dec > 0) {
            if (dec % 2 == 0)
                dc.append(0);
            else dc.append(1);
            dec /=2;
        }
        dc.reverse();  String temp =dc.toString();
        int finale = Integer.parseInt(temp);
        if(finale !=0)
        {
            System.out.println(dc);
            return finale;
        }
        return -1;
    }
}