package isp;

public class Bird implements walk ,fly{
    @Override
    public void walk() {
        System.out.println("bird can walk");
    }

    @Override
    public void fly() {
        System.out.println("bird can fly");
    }
}
