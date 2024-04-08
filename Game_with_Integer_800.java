import java.io.*;
public class Game_with_Integer_800 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        while(n-->0){
            int num=Integer.parseInt(br.readLine());
            if((num-1)%3==0||(num+1)%3==0)
                System.out.println("First");
            else
                System.out.println("Second");
        }

    }
}
