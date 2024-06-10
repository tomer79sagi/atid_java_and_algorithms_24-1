public class IfThenElseTernary {
    public static void main(String[] args) {
        int grade = (int)(Math.random() * 101);

        System.out.println(grade);
        System.out.println( grade >= 65 ? "Pass" : "Failed" );

//        if (grade >= 65) {
//            System.out.println("Pass");
//        } else {
//            System.out.println("Failed");
//        }
    }
}
