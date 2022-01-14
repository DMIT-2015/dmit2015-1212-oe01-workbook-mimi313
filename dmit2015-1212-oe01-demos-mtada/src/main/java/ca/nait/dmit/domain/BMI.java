package ca.nait.dmit.domain;

public class BMI {
    private double weight;
    private double height;

    // You'd create properties for private variables in C#
    // In Java, you'd create methods instead


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public BMI() {
        weight = 100;
        height = 60;
    }

    public BMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double bmi() {
        return 0;
    }

    public String bmiCategory() {
        return "";
    }
}
