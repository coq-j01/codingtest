package src;

import java.io.*;

public class ex04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int R = Integer.parseInt(br.readLine()); //줄 수
        int C = Integer.parseInt(br.readLine()); //문자열 수
        int L[][] = new int[2][2];
        int count=0;
        String ice[][] = new String[R][C];
        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                ice[i][j] = br.readLine();
                if(ice[i][j].equals("L")) {
                    L[count][0]=i;
                    L[count][1]=j;
                    count++;
                }
            }
        }
        int day=0;
        while(true){
            day++;
            for(int i=0; i<R; i++){
                for(int j=0; j<C; j++){
                    if(ice[i][j].equals("X")){
                        boolean melt = ice[i+1][j].equals(".") || ice[i-1][j].equals(".") ||
                                ice[i][j+1].equals(".") || ice[i][j-1].equals(".");
                        if(melt){
                            ice[i][j] = ".";
                        }
                    }
                }
            }
            if(day==3)break;
        }
       bw.write(day + "\n");

        bw.flush();
        bw.close();
    }
}
