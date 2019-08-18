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
    }
}
