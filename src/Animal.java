public abstract class Animal extends Thread {
    protected int position;
    protected int speed;
    protected boolean finished;

    public Animal(int speed) {
        this.position = 0;
        this.speed = speed;
        this.finished = false;
    }

    public abstract void run();

    public void move() {
        position += speed;
    }

    public int getPosition() {
        return position;
    }
    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }
}
