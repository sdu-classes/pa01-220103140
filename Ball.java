public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDeelta;

    public Ball(float x, float y, int radius, float xDelta, float yDeelta){
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDeelta = yDeelta;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getyDeelta() {
        return yDeelta;
    }

    public void setyDeelta(float yDeelta) {
        this.yDeelta = yDeelta;
    }
    public void move(){
        x += xDelta;
        y += yDeelta;
    }
    public void reflectHorizontal(){
        xDelta = (-1) * xDelta;
    }
    public void reflectVertical(){
        yDeelta = (-1) * yDeelta;
    }
    public String toString(){
        return "Ball " + getX() + " " + getY() + " speed " + getxDelta() + " " + getyDeelta();
    }
}

public class Main {
    public static void main(String[] args) {
        Ball b1 = new Ball(0.2f , 0.3f, 2, 0.3f, 0.4f);
        System.out.println(b1);
    }
}
