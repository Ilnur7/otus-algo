package lesson2_happynumbers;

public class JuniorHappyNumbers {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        long count = 0;
        for (int i = 0; i < 1000; i++) {
            count = lucky6Abs();
        }
        long end = System.currentTimeMillis() - start;
        System.out.println("Count: " + count + ", TimeMs: " + end);
    }

    // O(n)=10^n
    private static long lucky6() {
        long count = 0;
        for (int a1 = 0; a1 <= 9; a1++) {
            for (int a2 = 0; a2 <= 9; a2++) {
                for (int a3 = 0; a3 <= 9; a3++) {
                    int sum1 = a1 + a2 + a3;
                    for (int b1 = 0; b1 <= 9; b1++) {
                        for (int b2 = 0; b2 <= 9; b2++) {
                            for (int b3 = 0; b3 <= 9; b3++) {
                                int sum2 = b1 + b2 + b3;
                                if (sum1 == sum2) {
                                    count++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return count;
    }

    private static long lucky61() {
        long count = 0;
        for (int a1 = 0; a1 <= 9; a1++) {
            for (int a2 = 0; a2 <= 9; a2++) {
                for (int a3 = 0; a3 <= 9; a3++) {
                    int sum1 = a1 + a2 + a3;
                    for (int b1 = 0; b1 <= 9; b1++) {
                        for (int b2 = 0; b2 <= 9; b2++) {
                            int b3 = sum1 - b1 - b2;
                            if (b3 >= 0 && b3 <= 9) {
                                count++;
                            }
                        }
                    }
                }
            }
        }
        return count;
    }

    private static long lucky6Abs() {
        long count = 0;
        for (int a1 = 0; a1 <= 9; a1++) {
            for (int a2 = 0; a2 <= 9; a2++) {
                int sum1 = a1 + a2;
                for (int b1 = 0; b1 <= 9; b1++) {
                    for (int b2 = 0; b2 <= 9; b2++) {
                        int sum2 = b1 + b2;
                        int abs = Math.abs(sum1 - sum2);
                        if (abs <= 9) {
                            count += 10 - abs;
                        }
                    }
                }
            }
        }
        return count;
    }


}
