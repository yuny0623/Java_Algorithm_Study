import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
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
        }else if{
            String str = new String(arr);
            StringBuffer sb = new StringBuffer(str);
            sb.reverse().toString();
            System.out.print(sb);
        }
    }
}
