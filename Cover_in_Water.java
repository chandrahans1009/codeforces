import java.lang.*;
import java.io.*;



public class Cover_in_Water
{
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            int ans = solve(s,n);
            System.out.println(ans);
        }
    }
    public static int solve(String s,int n){
        int c=0;
        int len=s.length();
        for(int i=0;i<len;i++) {
            if(s.charAt(i)=='#')
                continue;
            else if (i<n-2&&s.charAt(i) == '.' && s.charAt(i + 1) == '.' && s.charAt(i + 2) == '.') {
                return 2;
            } else {
                c++;
            }
        }
        return c;
    }
}