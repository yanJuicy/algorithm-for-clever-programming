package recursion;

public class Code02 {

    public static void main(String[] args) {
        int n = 4;
        func(n);
    }

    public static void func(int k) {
        if (k <= 0) {  // Base case: 적어도 하나의 recursion의 빠지지 않는 경우가 존재해야 한다
            return;
        }

        System.out.println("Hello...");
        func(k - 1); // Recursive case: recursion을 반복하다보면 결국 base case로 수렴해야 한다
    }

}
