package src.com.seemscloud

public static class CounterInternal {
    static int count = 0

    static void increment() {
        count++
    }

    static int getCount() {
        return count
    }
}
