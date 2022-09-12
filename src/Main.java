public class Main {
    public static void main(String[] args) {

        Job job1 = new Job("intel " , 1000.0);

        Person p1 = new Person("David " ,job1 );

        Person p2 = new Person("Johan " , new Job("apple ", 1400.));

        Double salary = p1.getJob().getSalary();

        System.out.println(salary);

        p1.setName("Per ");

        System.out.println("Namn: " + p1.getName());

        p2.getJob().setSalary(1300.0);

        p1.setSalary(1100.0);

        System.out.println(p1);
        System.out.println(p2);
    }
}