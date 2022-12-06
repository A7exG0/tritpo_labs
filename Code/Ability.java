package trtpo;

public class Ability {
    private static final int DURATION = 3000;

    private static long activatedAt = Long.MAX_VALUE;

    public static void activate() {
        activatedAt = System.currentTimeMillis();
//        System.out.println("BLBLBL");
    }

    public static boolean isActive() {
        long activeFor = System.currentTimeMillis() - activatedAt;
        return activeFor >= 0 && activeFor <= DURATION;
    }
}