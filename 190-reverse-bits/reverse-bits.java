import java.math.BigInteger;
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String S= Integer.toBinaryString(n);
        String s2="";
        char arr[]=S.toCharArray();
        for(int i=S.length()-1;i>=0;i--){
            s2+=arr[i];
        }
        if(S.length()<32){
            for(int i=0;i<32-S.length();i++){
                s2+='0';
            }
        }
        long x = Long.parseLong(s2, 2);
        return (int)x;
    }
}