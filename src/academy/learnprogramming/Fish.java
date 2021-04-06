package academy.learnprogramming;

public class Fish extends Animal{
    private int gills;
    private int eyes;
    private int fin;

    public Fish(int size, int weight, String name, int gills, int eyes, int fin) {
        super(1, 1, size, weight, name);
        this.gills = gills;
        this.eyes = eyes;
        this.fin = fin;
    }

    private void rest() {

    }

    private void moveMuscles() {

    }

    private void moveBackFin() {

    }

    private void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}
