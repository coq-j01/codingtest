package src;

import java.io.*;
import java.util.StringTokenizer;

// 11401번 이항 계수3
public class ex05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int num1=1;
        int num2=1;
        if(N >= K && K!=0){
            for(int i=0; i<K; i++){
                num1 *= (N-i);
            }
            for(int i=K; i>0; i--){
                num2 *= i;
            }
            bw.write((num1/num2)%1000000007+"\n");
        }
        else{
            bw.write("0\n");
        }

        bw.flush();
        bw.close();
    }
}
