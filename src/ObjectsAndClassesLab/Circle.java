package ObjectsAndClassesLab;

class Circle {
    private double radius; //moje da se promenqt s a.setRadius ot main class-a dokato sa private
    private double area;   //moje da se promenqt s a.setRadius ot main class-a dokato sa private

    Circle(double radius) {  // constructor е method с името на class и е без return method (void примерно)
        this.radius = radius;
        this.area = Math.PI * radius * radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
        this.area = Math.PI * radius * radius;
    }
    double getRadius() {
        return this.radius;
    }
    String getInfo() {
        return "Circle (R=" + this.radius + ", A=" + this.area + ")";
    }
}

