//Henry Veedahl
//This class represents a crab

public class Crab {  //Start Class
    //Instance Varibles

    private int age;
    private double weight;
    private boolean alive;
    private boolean happy;

    //Constructors
    public Crab() {
        age = 0;
        weight = 4.0;
        alive = true;
        happy = false;
    }

    public Crab(int ag) {
        age = ag;
        weight = 4.0;
        alive = true;
        happy = false;
    }

    public Crab(int ag, double w) {
        age = ag;
        weight = w;
        alive = true;
        happy = false;
    }

    public Crab(int ag, double w, boolean al) {
        age = ag;
        weight = w;
        alive = al;
        happy = false;
    }

    public Crab(int ag, double w, boolean al, boolean h) {
        age = ag;
        weight = w;
        alive = al;
        happy = h;
    }

    //Seters
    public void setAge(int ag) {
        age = ag;
    }

    public void setWeight(double w) {
        weight = w;
    }

    public void setAlive(boolean al) {
        alive = al;
    }

    public void setHappy(boolean h) {
        happy = h;
    }

    //Getters
    public int getAge() {
        return (age);
    }

    public double getWeight() {
        return (weight);
    }

    public boolean getAlive() {
        return (alive);
    }

    public boolean getHappy() {
        return (happy);
    }
} //End Class
