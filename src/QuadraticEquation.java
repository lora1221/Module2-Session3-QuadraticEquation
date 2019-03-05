public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant(){
        return Math.pow(this.getB(), 2) - 4 * this.getA() * this.getC();
    }

    public double getRoot1(){
        return (-this.getB() + Math.sqrt(Math.pow(this.getB(),2) - 4 * this.getA()*this.getC()))/(2*this.getA());
    }

    public double getRoot2(){
        return (-this.getB() - Math.sqrt(Math.pow(this.getB(),2) - 4 * this.getA()*this.getC()))/(2*this.getA());
    }

    public void checkDelta(){
        if (this.getDiscriminant() < 0) {
            System.out.println("The equation has no roots");
        } else {
            if (this.getRoot1() == this.getRoot2()) {
                System.out.println("The equation has one root " + this.getRoot1());
            } else {
                System.out.println("The equation has two root " + this.getRoot1() + " and "
                + this.getRoot2());
            }

        }
    }
}
