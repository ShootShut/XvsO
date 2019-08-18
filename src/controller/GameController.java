package controller;

import model.Field;
import model.Point;
import model.User;

public class GameController {
    public static void doShoot(Point point, Field.Type type) {
        User.setPoint(point);
        User.setIsShoot(true);
    }
}
