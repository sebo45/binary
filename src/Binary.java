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
}