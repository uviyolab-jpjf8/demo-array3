/*
CH68 Arrays
8.8 Using a for Loop to Access Array Elements

Program: DemoArray3.java
Description: Using a for Loop to Access Array Elements
*/
public  class DemoArray3 {
    public static void main(String[] args) {

        double[] salaries = {2245.75, 600.55, 1000.25, 1600.85};
        System.out.print("The salaries one by one: ");
        for (int x = 0; x < salaries.length; ++x)
            System.out.println(salaries[x]);

    }
}