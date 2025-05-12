package src;

import java.io.*;
import java.util.*;

// 1655 가운데를 말해요
public class ex03 {
    public static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner(System.in);// 시간 초과 문제로 scanner 대신 br 쓰기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine()); //백준이가 외치는 정수의 개수
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // 작은 쪽
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // 큰 쪽

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());

            if (maxHeap.isEmpty() || num <= maxHeap.peek()) {
                maxHeap.offer(num);
            } else {
                minHeap.offer(num);
            }

            // 균형 맞추기
            if (maxHeap.size() > minHeap.size() + 1) {
                minHeap.offer(maxHeap.poll());
            } else if (minHeap.size() > maxHeap.size()) {
                maxHeap.offer(minHeap.poll());
            }

            // 중간값은 항상 maxHeap의 top
            //System.out.println(maxHeap.peek()); // System.out.println() 대신 bw 쓰기
            bw.write(maxHeap.peek() + "\n");

        }
        bw.flush(); // 꼭 flush 해줘야 출력됨!
        bw.close();
    }
}
