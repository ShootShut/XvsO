package model;

public class User {
    private static Point point;
    private volatile static boolean isShoot;

    public static void setPoint(Point point) {
        User.point = point;
    }

    public Point getShootPoint() {
        isShoot = false;
        while (!isShoot);
        return point;
    }

    public static void setIsShoot(boolean s) {
        isShoot = s;
    }
}
