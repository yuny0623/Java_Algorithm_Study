package BOJ.문자열.그리디;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p_10610 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] arr = new char[s.length()];

        for(int i = 0; i<s.length(); i++){
            arr[i] = s.charAt(i);
        }
        Arrays.sort(arr);

        if(arr[0] != '0'){
            System.out.println("-1");
        }else{
            String str = new String(arr);
            StringBuffer sb = new StringBuffer(str);
            sb.reverse().toString();
            System.out.println(sb);
        }
    }
}
