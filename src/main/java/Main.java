import utils.Queue.Deque;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deque<String> queue = new Deque<>();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            queue.add(scan.next());
        }
        System.out.println(queue.getSize());
        System.out.println(queue.remove());
        System.out.println(queue.getSize());
    }
}