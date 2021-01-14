package single.responsibility.cohension.ex1;

public class calculateArea extends SquareAreaCalculator {
    public int calculateArea() {
        int realSquare = size * size;
        return realSquare;
    }
}
