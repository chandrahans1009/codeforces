import java.io.*;

public class Board_1353C {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            if (n == 1)
                System.out.println("no");
            else {
                int c = 0;
                for (int i = 0; i < n - 1; i++) {
                    if (s.charAt(i) == '0' && s.charAt(i) == s.charAt(i + 1)) {
                        c++;
                    }
                }
                if (c > 0 && c % 2 == 0)
                    System.out.println("No");
                else
                    System.out.println("YES");


            }
        }

    }
}
