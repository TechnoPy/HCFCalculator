package org.bhooshan.hcfcalculator;

public class HCF {
    public static int calculateHCF(int smallerNumber, int largerNumber) throws Exception{
        int remainder = largerNumber % smallerNumber;
        if(remainder == 0) {
            return smallerNumber;
        }
        return calculateHCF(remainder, smallerNumber);
    }
}
