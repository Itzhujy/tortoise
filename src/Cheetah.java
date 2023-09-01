public class Cheetah extends Animal {
    public Cheetah() {
        super(3); // 设置猎豹速度为3
    }

    @Override
    public void run() {
        while (!isFinished()) {
            move();
            try {
                sleep(30); // 休眠一段时间以模拟动物的移动速度
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
