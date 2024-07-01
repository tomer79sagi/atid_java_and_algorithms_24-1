package homework;

import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your monthly salary: ");
        float salary = sc.nextFloat();

        // Calculat tax rates
        float tax = 0;

        // 1st Bracket
        if (salary >= 0 && salary <= 7010) {
            tax = salary * 0.1f;
        } else {
            tax += 7010 * 0.1f;

            // 2nd Bracket
            if (salary <= 10060) {
                tax += (salary - 7011) * 0.14f;
            } else {
                tax += (10060 - 7011) * 0.14f;

                // 3rd Bracket
                if (salary <= 16150) {
                    tax += (salary - 10061) * 0.2f;
                } else {
                    tax += (16150 - 10061) * 0.2f;

                    // 4th Bracket
                    if (salary <= 22440) {
                        tax += (salary - 16151) * 0.31f;
                    } else {
                        tax += (22440 - 16151) * 0.31f;

                        // 5th Bracket
                        if (salary <= 46690) {
                            tax += (salary - 22441) * 0.35f;
                        } else {
                            tax += (46690 - 22441) * 0.35f;

                            // 6th Bracket
                            if (salary <= 60130) {
                                tax += (salary - 46691) * 0.47f;
                            } else {
                                tax += (60130 - 46691) * 0.47f;

                                // 7th Bracket
                                if (salary > 60130) {
                                    tax += (salary - 60131) * 0.50f;
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println("Salary: " + salary);
        System.out.println("Tax: " + tax);
    }
}
