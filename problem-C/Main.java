public class Main {
    public static void main(String[] args) {
        Person person = new Person("Bob");
        System.out.println(person.getName());
        System.out.println(person.getAddress());
        Student student = new Student("Bob");
        System.out.println(student.getProgram());
        System.out.println(student.getYear());
        System.out.println(student.getFee());
        Staff staff = new Staff("Robert");
        System.out.println(staff.getSchool());
        System.out.println(staff.getPay());
    }
}