public class Tortoise extends Animal {
    public Tortoise() {
        super(1); // 设置乌龟速度为1
    }

    @Override
    public void run() {
        while (!isFinished()) {
            move();
            try {
                sleep(100); // 休眠一段时间以模拟动物的移动速度
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}