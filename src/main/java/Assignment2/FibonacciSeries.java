package Assignment2;

public class FibonacciSeries {
    private static int  COUNT= 2;
    private static int FIRST_NUMBER_IN_SERIES = 1;

    public int get(int index) {
        if(index < COUNT) {
            return FIRST_NUMBER_IN_SERIES;
        }
        return get(index - 1) + get(index - 2);
    }
}
