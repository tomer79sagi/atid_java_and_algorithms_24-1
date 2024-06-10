public class PrintExamples {
    public static void main(String[] args) {

        // Prints something and drops a line
        System.out.println();

        // Prints soemthing without dropping a line
        System.out.print("X");

        // Prints strings merged with variables (משתנים)
        String firstName = "Tomer";
        String lastName = "Sagi";
        byte age = 45;
        System.out.printf("My name is %s %s, and I'm %d years old", firstName, lastName, age);

        // -- Alternative
        System.out.print("My name is " + firstName + " " + lastName + ", and I'm " + age + " years old");
    }
}