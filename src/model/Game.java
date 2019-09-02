package model;

public class Game {
    Field field;
    User user;
    Computer computer;

    public void start() {
        field = new Field();
        user = new User();
        computer = new Computer();

        field.init();
        field.showField();

        while (true) {
            field.shoot(user.getShootPoint(), Field.Type.X);
            field.showField();
            if (field.whoIsWinner() == Field.Type.X) {
                System.out.println("Победил " + Field.Type.X);
                break;
            }

            field.shoot(computer.getShootPoint(), Field.Type.O);
            field.showField();
            if (field.whoIsWinner() == Field.Type.O) {
                System.out.println("Победил " + Field.Type.O);
                break;
            }
        }
    }
}
