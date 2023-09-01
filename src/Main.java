import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        RaceTrack raceTrack = new RaceTrack();
        Tortoise tortoise = new Tortoise();
        Rabbit rabbit = new Rabbit();
        Cheetah cheetah = new Cheetah();
        tortoise.start();
        rabbit.start();
        cheetah.start();

        while (true) {
            raceTrack.updateAnimalPosition(tortoise.getPosition(), rabbit.getPosition(), cheetah.getPosition());

            if (tortoise.getPosition() >= 400 || rabbit.getPosition() >= 400 || cheetah.getPosition() >= 400) {
                tortoise.setFinished(true);
                rabbit.setFinished(true);
                cheetah.setFinished(true);
                break;
            }
        }

        // 等待动物线程完成
        try {
            tortoise.join();
            rabbit.join();
            cheetah.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 最终结果
        if (tortoise.getPosition() >= 400 && rabbit.getPosition() >= 400 && cheetah.getPosition() >= 400) {
            JOptionPane.showMessageDialog(raceTrack, "都赢得了比赛！");
            System.out.println("It's a tie!");
        } else if (tortoise.getPosition() >= 400) {
            JOptionPane.showMessageDialog(raceTrack, "乌龟赢得了比赛！");
            System.out.println("Tortoise wins!");
        } else if (rabbit.getPosition() >= 400) {
            JOptionPane.showMessageDialog(raceTrack, "兔子赢得了比赛！");
            System.out.println("Rabbit wins!");
        } else {
            JOptionPane.showMessageDialog(raceTrack, "猎豹赢得了比赛！");
            System.out.println("Cheetah wins!");
        }

    }
}
