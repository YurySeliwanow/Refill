public class Main {
    public static void main(String[] args) {
        int check = 100;
        int replenishment = 1400;
        int percent;
        if (replenishment > 1000) {
            percent = 1;
        } else {
            percent = 0;
        }
        int bonus = percent * replenishment / 100;
        int total = check + replenishment + bonus;
        System.out.println("На счете:" + total);
    }
}

