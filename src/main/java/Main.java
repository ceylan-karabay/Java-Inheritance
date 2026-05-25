import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;
import com.workintech.developers.HRManager;
import com.workintech.developers.JuniorDeveloper;
import com.workintech.developers.MidDeveloper;
import com.workintech.developers.SeniorDeveloper;
import com.workintech.pool.Cuboid;
import com.workintech.pool.Rectangle;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5.0);

        System.out.println("Circle Radius: " + circle.getRadius());
        System.out.println("Circle Area: " + circle.getArea());

        System.out.println("------------------");

        Cylinder cylinder = new Cylinder(5.0, 10.0);

        System.out.println("Cylinder Radius: " + cylinder.getRadius());
        System.out.println("Cylinder Height: " + cylinder.getHeight());
        System.out.println("Cylinder Area: " + cylinder.getArea());
        System.out.println("Cylinder Volume: " + cylinder.getVolume());


        System.out.println("------------------");


        Rectangle rectangle = new Rectangle(5, 4);
        System.out.println("rectangle.area= " + rectangle.getArea());
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());

        Cuboid cuboid = new Cuboid(5, 4, 8);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
        System.out.println("cuboid.height= " + cuboid.getHeight());

        System.out.println("------------------");

        HRManager hr = new HRManager(1, "Ayse", 30000);

        JuniorDeveloper junior = new JuniorDeveloper(2, "Ali", 15000);
        MidDeveloper mid = new MidDeveloper(3, "Mehmet", 25000);
        SeniorDeveloper senior = new SeniorDeveloper(4, "Zeynep", 40000);

        junior.work();
        mid.work();
        senior.work();
        hr.work();

        System.out.println(junior.getSalary());
        System.out.println(mid.getSalary());
        System.out.println(senior.getSalary());
        System.out.println(hr.getSalary());

        hr.addEmployee(junior, 0);
        hr.addEmployee(mid, 1);
        hr.addEmployee(senior, 2);

        hr.addEmployee(junior, 0);


    }
}