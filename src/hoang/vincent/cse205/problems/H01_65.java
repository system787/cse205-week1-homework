package hoang.vincent.cse205.problems;

public class H01_65 {
    private int mX;

    private int mY = 0;

    private final int A = 100;

    public static final int B = 200;

    public H01_65(int pX) {
        setX(pX);
    }

    public H01_65() {
        this(-1);
    }

    public int getX() {
        return mX;
    }

    public void setX(int x) {
        mX = x;
    }

    public int getY() {
        return mY;
    }

    public void setY(int y) {
        mY = y;
    }
}
