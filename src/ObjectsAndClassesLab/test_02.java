package ObjectsAndClassesLab;

public class test_02 {

    public static void main(String[] args) {
        String s = "hello";
        s.length();


        Circle a = new Circle(5);
        System.out.println(a.getInfo());
        a.setRadius(10);     // това работи когато стойностите са private
        //a.radius = 7;      // това работи само ако в класа стойностите не са private
        System.out.println(a.getRadius());
        System.out.println(a.getInfo());
    }
}
